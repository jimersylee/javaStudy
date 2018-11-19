package Primary.Thread;

import Primary.LOL.Hero;

/**
 * 线程同步相关测试
 * Created by Jimersy Lee on 2017/4/14.
 */
public class Synchronized {
    public static void main(String[] args) {
        //多线程未使用同步时的效果

        //加锁操作,增加锁对象
        final Object lock=new Object();



        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;
        System.out.printf("盖伦的初始血量为%.0f%n", gareen.hp);
        //多线程同步问题指的是多个线程公式修改一个数据的时候,导致的问题
        //假设盖伦有10000的血.并且在基地里,同时被多个敌方英雄攻击,同时基地或者队友帮盖伦回血
        //用java代码表示,就是有多个线程在减少盖伦的hp,同时有多个线程在恢复盖伦的hp

        //n个线程在增加盖伦的hp
        int n = 10000;
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
        for (int i = 0; i < n; i++) {
            Thread t = new Thread() {

                public void run() {

                    //加锁操作,任何线程要修改hp的值,必须先占用锁
                    synchronized (lock){
                        gareen.recover();
                    }

                    //gareen.recover();
                    try {
                        //暂停100毫秒
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
        }

        //n个线程减少盖伦的hp
        for (int i = 0; i < n; i++) {
            Thread t2 = new Thread() {

                public void run() {

                    //加锁操作,任何线程要修改hp的值,必须先占用锁
                    synchronized (lock){
                        gareen.hurt();
                    }
                    //gareen.hurt();
                    try {
                        //暂停100毫秒
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t2.start();
            reduceThreads[i] = t2;

        }

        //等待加血所有线程结束
        for (Thread addThread :
                addThreads) {
            try {
                addThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //等待减血所有线程结束
        for (Thread reduceThread :
                reduceThreads) {
            try {
                reduceThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //代码执行到这里,所有线程结束
        //增加的线程和减少的线程数量是一样的,理论上结束后血量还是初始值
        System.out.printf("%d个增加线程和%d个减少线程结束后盖伦的血量变为%.0f%n",n,n,gareen.hp);




    }


}



