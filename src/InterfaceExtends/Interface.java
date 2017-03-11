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

    @Override
    public void physicAttack() {
        System.out.println(this.getName() + "进行物理攻击");
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
}

/**
 * 物魔双修英雄,实现物理魔法英雄接口,继承英雄类
 */
class ADAPHero extends Hero implements AD, AP {
    @Override
    public void physicAttack() {
        System.out.println(this.getName() + "进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println(this.getName() + "进行魔法攻击");
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
