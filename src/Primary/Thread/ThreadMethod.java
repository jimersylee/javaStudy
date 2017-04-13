package Primary.Thread;

import Primary.LOL.Hero;

/**
 * 常见线程方法
 * sleep:当前线程暂停
 * join:加入到当前线程中
 * setPriority:设置优先级
 * yield:临时暂停
 * setDaemon:设置守护线程
 * Created by Jimersy Lee on 2017/4/13.
 */
public class ThreadMethod {

    public static void main(String[] args) {
        ThreadMethod tm = new ThreadMethod();
        //tm.sleep();
        //tm.join();
        //tm.setPriority();
        //tm.yield();
        tm.setDaemon();
    }

    /**
     * 暂停当前线程
     */
    void sleep() {
        Thread t1 = new Thread() {
            public void run() {
                int seconds = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经晚了LOL%d秒%n", seconds++);
                }
            }
        };
        t1.start();

    }

    /**
     * 加入到当前线程中
     */
    void join() {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Thread t1 = new Thread() {
            public void run() {
                //
                while (!teemo.isDead()) {
                    gareen.attatckHero(teemo);
                }

            }
        };
        t1.start();
        //代码执行到这里,一直是main线程执行,
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //等待线程1结束,线程2才开始工作
        Thread t2 = new Thread() {
            public void run() {
                while (!bh.isDead()) {
                    gareen.attatckHero(bh);
                }
            }
        };
        t2.start();
    }

    /**
     * 设置线程优先级
     */
    void setPriority() {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 100000;
        gareen.damage = 1;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 100000;
        teemo.damage = 1;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 10000;
        bh.damage = 1;

        Thread t1 = new Thread() {
            public void run() {
                //
                while (!teemo.isDead()) {
                    gareen.attatckHero(teemo);
                }

            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                while (!bh.isDead()) {
                    gareen.attatckHero(bh);
                }
            }
        };
        t2.start();


        //到这里,这两个线程还是优先级相同,并行处理
        //开始设置优先级
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        //t2优先执行

    }

    /**
     * 临时暂停
     */
    void yield(){
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 100000;
        gareen.damage = 1;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 100000;
        teemo.damage = 1;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 10000;
        bh.damage = 1;

        Thread t1 = new Thread() {
            public void run() {
                //
                while (!teemo.isDead()) {
                    gareen.attatckHero(teemo);
                }

            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                while (!bh.isDead()) {
                    Thread.yield();
                    gareen.attatckHero(bh);
                }
            }
        };
        t2.start();


        //到这里,这两个线程还是优先级相同,并行处理
        //开始设置优先级
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);

        //t2优先执行
    }

    /**
     * 守护线程的概念是： 当一个进程里，所有的线程都是守护线程的时候，结束当前进程。
     */
    void setDaemon(){
        Thread t1=new Thread(){
          public void run(){
              int second=0;
              while (true){
                  try {
                      Thread.sleep(1000);
                  }catch (InterruptedException e){
                      e.printStackTrace();
                  }
                  System.out.printf("已经玩了%d秒%n",second++);
              }

          }
        };
        t1.setDaemon(true);
        t1.start();
    }

}
