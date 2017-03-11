package Class;

/**
 * 方法重载:方法名一样,参数类型不一样
 * Created by Jimersy Lee on 2017/3/11.
 */
public class Override {
    public static void main(String[] args) {
        Override o=new Override();
        o.override();
        o.variableParam();
    }

    /**
     * 方法重载
     */
    public void override() {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
        Hero timo = new Hero();
        timo.name = "提莫";
        Hero garan = new Hero();
        garan.name = "盖伦";
        Hero qinnv=new Hero();
        qinnv.name="琴女";

        bh.attack(timo);
        bh.attack(timo, garan);
        bh.attack(timo,garan,qinnv);
    }

    /**
     * 可变参数
     */
    public void variableParam() {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人加强版";
        Hero timo = new Hero();
        timo.name = "提莫加强版";
        Hero garan = new Hero();
        garan.name = "盖伦加强版";
        Hero qinnv=new Hero();
        qinnv.name="琴女加强版";

        bh.attack(timo,garan,qinnv);
    }
}


class Hero {
    String name;
    int hp;

    /**
     * 给类中name赋值
     * 方法名和属性名一样,只能访问到参数name;
     * @param name:姓名
     */
    public void setName1(String name){
        name=name;
    }

    /**
     * 为了避免setName1中的问题,参数名不得不适用其他变量名
     */
    public void setName2(String heroName){
        name=heroName;
    }

    /**
     * 通过this访问属性,就可以使参数名与类成员名同名
     */
    public void setName3(String name){
        this.name=name;
    }

    /*public Hero(String name){
        this.name=name;
    }*/
    /*public Hero(String name,int hp){
        this(name);
        this.hp=hp;
    }*/
}

/**
 * 方法重载,方法名是一样的,但是参数类型不一样,会根据传递的参数类型以及数量,自动调用对应的方法
 */
class ADHero extends Hero {


    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "对" + h1.name + "和" + h2.name + "进行了一次攻击");
    }

    public void attack(Hero...heroes){
        for (Hero each :
                heroes
                ) {
            System.out.println(name+"攻击了"+each.name);
        }
    }
}
