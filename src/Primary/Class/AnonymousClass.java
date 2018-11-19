package Primary.Class;

import java.lang.Override;

/**
 * 匿名类
 * 匿名类指的是在声明一个类的同时实例化它,使代码更加简洁精练,通常情况下,要使用一个接口或者抽象类,都必须创建一个子类
 * 有的时候,为了快速使用,直接实例化一个抽象类,并当场实现其抽象方法,既然实现了抽象方法,那么就是一个新的类,只是这个类没有命名,这样的类,叫做匿名类
 * Created by Jimersy Lee on 2017/3/27.
 */
public abstract class AnonymousClass {
    String name;
    public abstract void attack();
    public static void main(String[] args){
       //在匿名内部类中使用外部的局部变量,外部的局部变量必须修饰为final
        final int damage=5;
        //匿名类实现
        AnonymousClass ac=new AnonymousClass() {
               @Override
               public void attack() {
                   System.out.printf("新的攻击手段,造成%d点伤害\n",damage);

               }
           };

           ac.attack();
           System.out.println(ac);
           //新的攻击手段
           //Primary.Class.AnonymousClass$1@74a14482

    }
}
