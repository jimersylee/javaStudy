package Primary.Class;

/**
 * 类的继承
 * Created by Jimersy Lee on 2017/3/11.
 */
public class Extends {
    public static void main(String[] args) {
        Extends e=new Extends();
        e.notExtends();
        e.extendsDo();
    }

    private void notExtends(){
        Weapon knife=new Weapon();
        knife.name="杀猪刀";
        knife.price=100;
        knife.damage=20;

    }
    private void  extendsDo(){
        NewWeapon knife=new NewWeapon();
        knife.name="杀猪刀";
        knife.price=100;
        knife.damage=20;
    }


}

/**
 * 物品基类
 */
class Item {
    String name;
    int price;

}


/**
 * 不继承的Weapon
 */
class Weapon{
    String name;
    int price;
    int damage;
}

/**
 * 继承自Item的NewWeapon
 */
class NewWeapon extends Item{
    int damage;
    //从Item中继承了name,price,在这里不用声明
}
