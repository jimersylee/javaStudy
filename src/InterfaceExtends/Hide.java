package InterfaceExtends;

import LOL.Hero;

/**
 * 隐藏
 * 与重写方法类似,方法的重写是子类覆盖父类的对象方法
 * 隐藏,就是子类覆盖父类的类方法
 * Created by Jimersy Lee on 2017/3/13.
 */
public class Hide {
    public static void main(String [] args){
        Hide hide=new Hide();
        hide.hide();
    }


    public void hide(){
        Hero h=new Hero();
        ADHero ad=new ADHero();
        h.battleWin();
        ad.battleWin();

        //测试隐藏
        Hero hide=new ADHero();
        hide.battleWin();

    }
}
