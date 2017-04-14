package Primary.Thread;

import java.util.Date;

/**
 * 简单线程池测试
 *
 * Created by Jimersy Lee on 2017/4/14.
 */
public class ThreadPoolTest {
    public static void main(String[] args){
        ThreadPool tp=new ThreadPool(10);
        for (int i=0;i<10;i++){
            Runnable task=new Runnable() {
                @Override
                public void run() {
                    Date date=new Date();
                    System.out.println("执行任务"+date);
                }
            };
            tp.add(task);


            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
