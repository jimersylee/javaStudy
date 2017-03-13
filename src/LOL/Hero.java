package LOL;
import LOL.Item;

/**
 * Created by Jimers Lee on 2017/2/24.
 */
public class Hero {
    private String name;
    private float hp;
    private float armor;
    public int moveSpeed=300;


    public void setName(String name) {
        this.name = name;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public String getName() {

        return name;
    }

    public float getHp() {
        return hp;
    }

    public float getArmor() {
        return armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }



    public Hero(String name){
        System.out.println("Hero的有参构造函数");
        this.name=name;
    }

    public Hero(){

    }

    public void finalize(){
        System.out.println("这个英雄正在被回收...");
    }




    public static void main(String[] args){
        Hero garen=new Hero();
        garen.name="盖伦";
        garen.hp=616.28f;
        garen.armor=27.536f;
        garen.moveSpeed=350;


        Hero teemo=new Hero();
        teemo.armor=14f;
        teemo.moveSpeed=330;
        teemo.hp=383f;
        teemo.name="提莫";

        garen.keng();
        garen.legenderay();
        garen.chat("哈哈哈");

    }

     void keng(){
        System.out.println(this.name+"坑了队友");
    }

    /**
     * 超神
     */
    void legenderay(){
         System.out.println(this.name+"超神了!");
    }

    /**
     * 回血
     * @param blood:回的血量
     * @return 返回回血后的血量
     */
    float recovery(float blood){
        return this.hp=this.hp+blood;
    }


    void chat(String content){
        char koutouchan='干';
        System.out.println(this.name+"说:"+koutouchan+"!"+content);
    }


    public void useItem(Item i){
        i.effect();
    }

    public void useLifePoint(LifePoint lifePoint){
        System.out.println(this.name+"使用血瓶啦");
    }
    public void useMagicPoint(MagicPoint magicPoint){
        System.out.println(this.name+"使用魔瓶啦");
    }



    public static void battleWin(){
        System.out.println("hero battle Win");
    }
}









