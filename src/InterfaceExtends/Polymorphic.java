package InterfaceExtends;

import LOL.Hero;
import LOL.Item;
import LOL.LifePoint;
import LOL.MagicPoint;


/**
 * 多态
 * Created by Jimersy Lee on 2017/3/12.
 */
public class Polymorphic {
    public static void main(String [] args){
        Polymorphic p=new Polymorphic();
        p.operator();
        p.notUsePolymorphic();
        p.classOperator();
        p.usePolymorphic();
    }


    public void operator(){
        int i=5;
        int j=6;
        int k=i+j;//如果+两侧是整型,那么+代表相加
        System.out.println(k);

        int a=5;
        String b="5";
        String c=a+b;//如果+号两侧,任意一个是字符串,那么+代表字符串连接
        System.out.println(c);

    }

    /**
     * 类的多态
     * 类的多态条件
     * 1.父类(接口)引用指向子类对象
     * 2.调用的方法有重写
     */
    public void classOperator(){
        Item lp=new LifePoint();
        Item mp=new MagicPoint();
        System.out.print("i1  是Item类型，执行effect打印:");
        lp.effect();
        System.out.print("i2也是Item类型，执行effect打印:");
        mp.effect();
    }

    /**
     * 不使用多态的实现方式
     */
    public void notUsePolymorphic(){
        Hero garen=new Hero();
        garen.setName("盖伦");
        LifePoint lifePoint=new LifePoint();
        MagicPoint magicPoint=new MagicPoint();
        garen.useLifePoint(lifePoint);
        garen.useMagicPoint(magicPoint);
        //如果要使用其他物品,则要写很多use方法

    }

    /**
     * 使用多态的实现方式
     */
    public void usePolymorphic(){
        Hero garen=new Hero();
        garen.setName("盖伦");
        LifePoint lifePoint=new LifePoint();
        MagicPoint magicPoint=new MagicPoint();
        garen.useItem(lifePoint);
        garen.useItem(magicPoint);
    }




}
