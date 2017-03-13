package InterfaceExtends;

/**
 * final修饰类时,意味着本类不能被继承
 * final修饰方法时,意味着方法不能被重写
 * final修饰基本变量类型时,意味着变量只能被赋值一次
 * final修饰引用时,意味着该引用只有一次指向引用的机会
 * Created by Jimersy Lee on 2017/3/13.
 */
public class finalTest {
    public static final int xxx=6;//常量,不变的



    public static void main(String [] args){

    }

    public  void finalClass(){

    }

    public void finalMethod(){

    }
}

final class finalClass{
    String name;
    int hp;
}


/*class extendsFinalClass extends finalClass{
   //编译错误
}*/


class finalMethod{
    public final void method(){

    }
}

class extendsFinalMethod extends finalMethod{
    /*public void method(){
       //编译错误
    }*/
}
