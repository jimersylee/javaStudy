package InterfaceExtends;

import LOL.Hero;

/**
 * 接口
 * Created by Jimersy Lee on 2017/3/11.
 */
public class Interface {

}

/**
 * 物理英雄,实现物理英雄接口,继承英雄类
 */
class ADHero extends Hero implements AD {

    public ADHero(){

    }
    public ADHero(String name){
        super(name);
        System.out.println("父类的初始速度:"+super.moveSpeed);
        System.out.println("ADHero 的构造方法");
    }
    @Override
    public void physicAttack() {
        System.out.println(this.getName() + "进行物理攻击");
    }

    public static void battleWin(){
        System.out.println("ADHero battle win");
    }

}

/**
 * 魔法英雄,实现魔法英雄接口,继承英雄类
 */
class APHero extends Hero implements AP {
    @Override
    public void magicAttack() {
        System.out.println(this.getName() + "进行魔法攻击");
    }

    public APHero(){

    }

    public APHero(String name){
        super(name);
        System.out.println("APHero 的构造方法");
    }
}

/**
 * 物魔双修英雄,实现物理魔法英雄接口,继承英雄类
 */
class ADAPHero extends Hero implements AD, AP {
    public ADAPHero(){

    }


    public ADAPHero(String name){
        super(name);
        System.out.println("ADAPHero 的构造方法");
    }
    @Override
    public void physicAttack() {
        System.out.println(this.getName() + "进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println(this.getName() + "进行魔法攻击");
    }
}

class SupportHero extends Hero{

    public SupportHero(){

    }
    public SupportHero(String name){
        super(name);
    }
}


/**
 * 物理英雄 接口类
 */
interface AD {
    /**
     *必然会物理攻击
     */
    void physicAttack();
}

/**
 * 魔法英雄 接口类
 */
interface AP {
    /**
     * 必然会魔法攻击
     */
    void magicAttack();
}




