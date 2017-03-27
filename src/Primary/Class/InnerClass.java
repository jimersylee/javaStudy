package Primary.Class;

/**
 * 内部类
 * Created by Jimersy Lee on 2017/3/27.
 */
public class InnerClass {
    private String name;

    /**
     * 公开内部类
     */
    public class BattleScore{
        //非静态内部类,只有当外部类对象存在的时候,才有意义
        //比如战斗成绩只有在一个英雄对象存在的时候才有意义
        int kill;
        public void legendary(){
            if(kill>=8){
                System.out.println(name+"超神!");
            }else{
                System.out.println(name+"尚未超神!");
            }
        }
    }

    /**
     * 静态内部类
     */
    static class EnemyCrystal{
        int hp=5000;
        //如果水晶的血量为0,则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                //静态内部类可以直接访问外部类的私有静态方法
                InnerClass.battleWin();
                //静态内部类不能直接访问外部类的对象属性
                //System.out.println(name+"win this game");
            }
        }
    }

    /**
     * 私有静态方法
     */
    private static void battleWin(){
        System.out.println("battle win");
    }



    public static void main(String[] args){
        //公开内部类测试开始
        InnerClass garen=new InnerClass();
        garen.name="盖伦";
        //先实例化外部类,然后实例化内部类
        BattleScore score=garen.new BattleScore();
        score.kill=9;
        score.legendary();
        //公开内部类测试结束

        //静态内部类测试开始
        InnerClass.EnemyCrystal crystal=new InnerClass.EnemyCrystal();
        crystal.checkIfVictory();

        //静态内部类测试结束




    }





}



