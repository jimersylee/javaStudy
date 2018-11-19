package Primary.Thread;

import java.util.LinkedList;

/**
 * 简单线程池
 * Created by Jimersy Lee on 2017/4/14.
 */
public class ThreadPool {
    //线程池大小
    int threadPoolSize;
    //任务容器
    LinkedList<Runnable> tasks=new LinkedList<Runnable>();
    //创建试图消费任务的线程池
    public ThreadPool(int threadPoolSize){
        this.threadPoolSize=threadPoolSize;
        synchronized (tasks){
            for(int i=0;i<this.threadPoolSize;i++){
                new TaskConsumeThread("任务消费者线程"+i).start();
            }
        }
    }

    public void add(Runnable r){
        synchronized (tasks){
            tasks.add(r);
            tasks.notifyAll();
        }
    }

    class TaskConsumeThread extends Thread{
        public TaskConsumeThread(String name){
            super(name);
        }
        Runnable task;
        public void run(){
            System.out.println("启动:"+this.getName());
            while (true){
                synchronized (tasks){
                    while (tasks.isEmpty()){
                        try {
                            tasks.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    task=tasks.removeLast();
                    tasks.notifyAll();
                }

                System.out.println(this.getName()+"获取到任务,并执行");
                task.run();
            }


        }

    }
}
