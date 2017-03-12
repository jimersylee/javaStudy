package InterfaceExtends;

/**
 * 重写
 * 如果没有重写这样的机制，也就是说LifePotion这个类，一旦继承了Item，所有方法都不能修改了。但是LifePotion又希望提供一点不同的功能，为了达到这个目的，只能放弃继承Item,重新编写所有的属性和方法，然后在编写effect的时候，做一点小改动.这样就增加了开发时间和维护成本
 * Created by Jimersy Lee on 2017/3/12.
 */
public class OverrideTest {
    public static void main(String [] args){
        Item i=new Item();
        i.effect();
        LifePoint lp=new LifePoint();
        lp.effect();
    }

}

 class Item{
    public void buy(){

    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

 }
class LifePoint extends Item{
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
}