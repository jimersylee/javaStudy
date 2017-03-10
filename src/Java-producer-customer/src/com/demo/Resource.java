package com.demo;

/**
 * Created by Jimersy Lee on 2016-10-18.
 * 资源类,生产者生产此资源,消费者消费此资源
 */
public class Resource {
    /**
     * 线程计数器
     */
    private int number=0;
    /**
     * 是否可以通知生产者生产资源
     */
    private boolean flag=false;

    /**
     * 生产资源
     */
    public synchronized void create() {
        while(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "生产者------------" + number);
        flag=true;
        notifyAll();
    }

    /**
     * 消费资源
     */
    public synchronized void destroy() {
        while (!flag) {
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "消费者****" + number);
        flag=false;
        notifyAll();
    }

}
