package com.demo;
import java.util.Random;
/**
 * Created by Jimersy Lee on 2016-10-18.
 */
public class Consumer implements Runnable {
    private Resource resource;
    public Consumer(Resource resource){
        this.resource=resource;
    }

    @Override
    public void run() {



        while(true){
            try{
                Random random=new Random();
                long time=(long)random.nextDouble()*1000;
                Thread.sleep(time);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            resource.destroy();
        }
    }
}
