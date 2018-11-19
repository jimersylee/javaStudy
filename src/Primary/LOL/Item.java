package Primary.LOL;

/**
 * Created by Jimers Lee on 2017/2/24.
 */
public class Item {
    String name;
    int price;


    public static void main(String[] args){
        Item blood=new Item();
        blood.name="血瓶";
        blood.price=50;

        Item shoe=new Item();
        shoe.name="草鞋";
        shoe.price=300;

        Item sword=new Item();
        sword.name="长剑";
        sword.price=350;
    }


    public void effect(){
        System.out.println("物品被使用啦");
    }
}









