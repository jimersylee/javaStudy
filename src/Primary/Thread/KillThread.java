package Primary.Thread;

import Primary.LOL.Hero;

/**
 * 击杀线程
 * Created by Jimersy Lee on 2017/4/11.
 */
public class KillThread extends Thread{
    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attatckHero(h2);
        }
    }
}
