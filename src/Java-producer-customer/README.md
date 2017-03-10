# Java-producer-consumer


java的多线程生产者消费者模型

需求情景
	* 两个线程，一个负责生产，一个负责消费，生产者生产一个，消费者消费一个

涉及问题
	* 同步问题：如何保证同一资源被多个线程并发访问时的完整性。常用的同步方法是采用标记或加锁机制

	* wait() / nofity() 方法是基类Object的两个方法，也就意味着所有Java类都会拥有这两个方法，这样，我们就可以为任何对象实现同步机制。

	* wait()方法：当缓冲区已满/空时，生产者/消费者线程停止自己的执行，放弃锁，使自己处于等等状态，让其他线程执行。

	* notify()方法：当生产者/消费者向缓冲区放入/取出一个产品时，向其他等待的线程发出可执行的通知，同时放弃锁，使自己处于等待状态。




需求情景
	* 四个线程，两个个负责生产，两个个负责消费，生产者生产一个，消费者消费一个

涉及问题
	* notifyAll()方法：当生产者/消费者向缓冲区放入/取出一个产品时，向其他等待的所有线程发出可执行的通知，同时放弃锁，使自己处于等待状态。

再次测试代码
	* main.java

package com.demo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Resource resource=new Resource();
        new Thread(new Consumer(resource)).start();
        new Thread(new Consumer(resource)).start();
        new Thread(new Producer(resource)).start();
        new Thread(new Producer(resource)).start();
    }
}


Thread-0生产者------------100
Thread-3消费者****100
Thread-0生产者------------101
Thread-3消费者****101
Thread-2消费者****101
Thread-1生产者------------102
Thread-3消费者****102
Thread-0生产者------------103
Thread-2消费者****103
Thread-1生产者------------104
Thread-3消费者****104
Thread-1生产者------------105
Thread-0生产者------------106
Thread-2消费者****106
Thread-1生产者------------107
Thread-3消费者****107
Thread-0生产者------------108
Thread-2消费者****108
Thread-0生产者------------109
Thread-2消费者****109
Thread-1生产者------------110
Thread-3消费者****110

	* 通过以上打印结果发现问题

	* 
		* 101生产了一次，消费了两次
		* 105生产了，而没有消费

	* 原因分析

	* 
		* 当两个线程同时操作生产者生产或者消费者消费时，如果有生产者或者的两个线程都wait()时，再次notify(),由于其中一个线程已经改变了标记而另外一个线程再次往下直接执行的时候没有判断标记而导致的。
		* if判断标记，只有一次，会导致不该运行的线程运行了。出现了数据错误的情况。

	* 解决方案

	* 
		* while判断标记，解决了线程获取执行权后，是否要运行！也就是每次wait()后再notify()时先再次判断标记


代码改进（Resource中的if->while）
public class Resource {
    
    private int number = 0;
    
    private boolean flag = false;

    /**
     * 生产资源
     */
    public synchronized void create() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        flag = true;
        notify();
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);

        flag = false;
        notify();
    }
}



	* 再次发现问题 

	* 
		* 打印到某个值比如生产完74，程序运行卡死了，好像锁死了一样。

	* 原因分析

	* 
		* notify:只能唤醒一个线程，如果本方唤醒了本方，没有意义。而且while判断标记+notify会导致”死锁”。

	* 解决方案

	* 
		* notifyAll解决了本方线程一定会唤醒对方线程的问题。


最后代码改进（Resource中的notify()->notifyAll()）
public class Resource {
    
    private int number = 0;
    
    private boolean flag = false;

    /**
     * 生产资源
     */
    public synchronized void create() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        flag = true;
        notifyAll();
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);

        flag = false;
        notifyAll();
    }
}

Thread-0生产者------------412
Thread-2消费者****412
Thread-0生产者------------413
Thread-3消费者****413
Thread-1生产者------------414
Thread-2消费者****414
Thread-1生产者------------415
Thread-2消费者****415
Thread-0生产者------------416
Thread-3消费者****416
Thread-1生产者------------417
Thread-3消费者****417
Thread-0生产者------------418
Thread-2消费者****418
Thread-0生产者------------419
Thread-3消费者****419
Thread-1生产者------------420
Thread-2消费者****420
以上就大功告成了，没有任何问题



