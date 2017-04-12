package Primary.Thread;

import Primary.LOL.Hero;

/**
 * 线程类
 * Created by Jimersy Lee on 2017/4/11.
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        //tt.noThread();

        //tt.thread();
        //tt.runnableTest();
        tt.anonymousClassTest();
    }

    /**
     * 不使用线程
     */
    public void noThread() {
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

        while (!teemo.isDead()) {
            gareen.attatckHero(teemo);
        }

        while (!bh.isDead()) {
            gareen.attatckHero(bh);
        }

    }

    /**
     * 使用线程
     */
    public void thread() {
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

        KillThread killThread0 = new KillThread(gareen, teemo);
        killThread0.start();
        KillThread killThread1 = new KillThread(gareen, bh);
        killThread1.start();

    }

    /**
     * runnable
     * Battle实现了Runnable接口,所以有run方法,但是直接调用run方法,并不会启动一个新的线程
     * 必须,借助一个线程对象的start()方法,才会启动一个新的线程
     * 所以在创建Thread对象的时候,把battle作为构造方法的参数传递进去,这个线程启动的时候,就会执行battle的run()方法了
     */
    public void runnableTest() {
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


        Battle battle1 = new Battle(gareen, teemo);
        new Thread(battle1).start();

        Battle battle2 = new Battle(gareen, bh);
        new Thread(battle2).start();

    }

    /**
     * 使用匿名类,继承Thread,重写run方法,直接在run方法中写业务代码
     */
    public void anonymousClassTest() {
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

        Thread t2 = new Thread() {
            public void run() {
                while (!bh.isDead()) {
                    gareen.attatckHero(bh);
                }
            }
        };
        t2.start();
    }

}
