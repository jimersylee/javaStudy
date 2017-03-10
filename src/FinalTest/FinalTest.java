package FinalTest;


/**
 * final修饰符
 * Created by Jimers Lee on 2017/3/8.
 */
public class FinalTest {

    void main(String [] args){
        final int i=1;
        //i=2; 编译错误 ,因为在第九行已经声明并赋值,因此再次赋值失败

        final int k;
        k=2;//因为在line12只是声明,因此在这里是第一次赋值,可以赋值
        //k=3; 编译错误,因为在line 13 已经赋值,再次赋值失败
    }


    //如果final修饰的是参数,能否在方法里给这个参数赋值
    public void method1(final int i){
        //i=5; 不能赋值,final修饰参数的时候,意味着参数只能在函数调用时赋值,不能重新赋值

    }

}
