package Primary.Class;

/**
 * 构造函数
 * Created by Jimersy Lee on 2017/3/11.
 */
public class Constructor {

    /**
     * 无参的构造函数
     */
    public Constructor(){

    }

    /**
     * 有参的构造函数,构造函数可以重载
     * @param name:名字
     */
    public Constructor(String name){
        System.out.println("实例化一个"+name+"对象的时候,必然调用构造方法");
    }
    public static void main(String [] args){
          Constructor c=new Constructor("Constructor");
          Constructor d=new Constructor();//如果设置了构造函数是有参数的,则无参的构造函数就没有了

    }

}
