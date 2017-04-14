package Primary.Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子操作测试
 * Created by Jimersy Lee on 2017/4/14.
 */
public class AtomicTest {
    private int value=0;
    public static void main(String[] args){
        AtomicInteger ato=new AtomicInteger();
        int i=ato.decrementAndGet();
        int j=ato.incrementAndGet();
        int k=ato.addAndGet(3);
        AtomicTest at=new AtomicTest();
        at.atoAndNot();

    }

    void atoAndNot(){
        int number=100000;

        Thread[] aT1=new Thread[number];
        for (int i=0;i<number;i++){
            Thread t=new Thread(){
                public void run(){
                    value++;
                }
            };
            t.start();
            aT1[i]=t;
        }

        //等待线程结束
        for (Thread t :
                aT1) {
           try {
               t.join();
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }

        System.out.printf("%d个线程进行value++后，value的值变成:%d%n", number,value);


        AtomicInteger ato=new AtomicInteger();
        Thread[] aT2=new Thread[number];
        for (int i=0;i<number;i++){
            Thread t=new Thread(){
                public void run(){
                    ato.incrementAndGet();
                }
            };
            t.start();
            aT1[i]=t;
        }

        //等待线程结束
        for (Thread t :
                aT1) {
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.printf("%d个线程进行incrementAndGet()后，value的值变成:%d%n", number,ato.intValue());
    }
}
