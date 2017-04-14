package Primary.Thread;

import Primary.LOL.Hero;

/**
 * Created by Jimersy Lee on 2017/4/14.
 */
public class waitNotify {

    static class HurtThread extends Thread{
        private Hero hero;

        public HurtThread(Hero hero) {
            this.hero = hero;
        }
        public void  run(){

                while (true){
                    hero.hurt2();
                    try {
                        Thread.sleep(100);;
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

        }
    }
    static class RecoverThread extends Thread{
        private Hero hero;
        public RecoverThread(Hero hero){
            this.hero=hero;
        }

        public void run(){
            while (true){
                hero.recover2();
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){
        final Hero gareen=new Hero();
        gareen.name="盖伦";
        gareen.hp=666;
        for(int i=0;i<2;i++){
            new RecoverThread(gareen).start();
        }
        for (int i=0;i<2;i++){
            new HurtThread(gareen).start();
        }
    }
}
