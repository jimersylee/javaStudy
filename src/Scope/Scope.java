package Scope;

/**作用域
 * Created by Jimers Lee on 2017/3/8.
 */
public class Scope {
    //属性的作用域在方法中，参数的作用域也在方法中，如果属性和参数命名相同了的话？ 那么到底取哪个值？

    //在方法内部,参数具有更高优先级? 结果是5
    int i=1;
    private void method1(int i){
        System.out.println(i);
    }

    public static void main(String [] args){
        new Scope().method1(5);
    }

}
