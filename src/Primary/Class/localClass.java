package Primary.Class;

/**
 * 本地类
 * Created by Jimersy Lee on 2017/3/27.
 */
public abstract class localClass {
    String name;
    public abstract void attack();




    public static void main(String[] args){
        //与匿名类的区别在于,本地类有了自定义的类名
        class localLocalClass extends localClass{
            public void attack(){
                System.out.println(name+"新的进攻手段");
            }
        }
        localLocalClass l=new localLocalClass();
        l.name="地卜师";
        l.attack();
    }


}
