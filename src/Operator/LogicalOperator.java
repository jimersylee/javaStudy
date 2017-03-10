package Operator;

/**
 * 逻辑操作符
 * Created by Jimers Lee on 2017/3/9.
 */
public class LogicalOperator {


    public static void main(String [] args){
        LogicalOperator lo=new LogicalOperator();
        lo.shortLongAnd();
        lo.shortLongOr();
        lo.xor();
    }

    /**
     * 短路与&& 和 长路与&
     */
    public void shortLongAnd(){
        //长路与 无论第一个表达式的值是true或者false,第二个值都会被运算
        int i=2;
        System.out.println(i==1 & i++==2);
        System.out.println(i);

        //短路与 只要第一个值是false,第二个表达式的值就不进行运算了,因此j还是2
        int j=2;
        System.out.println(j==1 && j++==2);
        System.out.println(j);

    }

    /**
     * 短路或 || 和 长路或 |
     */
    public void shortLongOr(){
        //长路或 无论第一个表达式的值是true或者false,第二个值都会被运算
        int i=2;
        System.out.println(i==1 | i++==2);
        System.out.println(i);
        //短路或 只要第一个表达式的值是true,则第二个值就不运算
        int j=2;
        System.out.println(j==2 || j++==2);
        System.out.println(j);
    }

    /**
     * 异或 xor,两个值不同返回真,两个值相同返回家
     */
    public void xor(){
        boolean a=true;
        boolean b=false;
        System.out.println(a^b);//不同返回真
        System.out.println(a^!b);//相同返回假
    }








}
