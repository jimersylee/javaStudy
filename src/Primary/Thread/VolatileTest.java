package Primary.Thread;

/**
 * volatile关键字
 * volatile修饰那种可能被多个线程访问,且可能会被意外修改的变量,volatile修饰的变量可以被多个线程同时访问,synchroinzed修饰的同时只能有一个变量访问
 * Created by Jimersy Lee on 2017/4/12.
 */
public class VolatileTest {

    public boolean stop=false;
    public volatile boolean stopVolatile=false;

    public static void main(String[] args) {
        VolatileTest vt=new VolatileTest();
        vt._wait();
        vt.waitUseVolatile();

    }

    public void _wait() {
        while (!stop){
            System.out.println("你还没有停下来");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void wakeUp() {
            stop=true;
    }


    public void waitUseVolatile(){
        while (!stopVolatile){
            System.out.println("我还没有停下来");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }


        }
    }

    public void wakeUpUseVolatile(){
        stopVolatile=true;
    }
}
