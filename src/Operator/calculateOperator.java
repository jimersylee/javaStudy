package Operator;

/**
 * 算数操作符
 * Created by Jimers Lee on 2017/3/8.
 */
public class calculateOperator {

    public static void main(String [] args){
        calculateOperator o=new calculateOperator();
        o.lessThanInt();
        o.moreThanInt();
        o.mod();
        o.sum();
        o.autoIncrementTest();
        o.autoIncrement();
        o.autoDecrement();
        o.autoIncrementBeforeAndAfter();

    }

    private void sum(){
        /*Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();*/
        int a=1;
        int b=2;
        int sum=a+b;
        System.out.println(sum);
    }

    /**
     * 任意运算单元的长度超过int
     * 如果如此,那么运算结果就按最长的长度计算
     */
    private void moreThanInt(){
        int a=5;
        long b=6;
        int c=(int)(a+b);//a+b的运算结结果是long,所以要进行强制类型转化
        long d=a+b;
    }

    /**
     * 任意运算单元长度小于int
     * 如果如此,那么运算结果就按int算
     */
    private void lessThanInt(){
        byte a=1;
        byte b=2;
        byte c=(byte)(a+b);//虽然 a,b都是byte类型,但是运算结果是int类型,需要进行强制类型转换
        int d=a+b;
    }

    /**
     * 取模 %,取余数
     */
    private void mod(){
        int a=5;
        int b=2;
        int mod=a%b;
        System.out.println(mod);
    }

    /**
     * 自增++
     */
    private void autoIncrement(){
        int i=5;
        i++;
        System.out.println("autoIncrement:"+i);
    }

    /**
     *自减 --
     */
    private void autoDecrement(){
        int i=5;
        i--;
        System.out.println("autoDecrement:"+i);
    }



    private void autoIncrementBeforeAndAfter(){
        int i=5;
        System.out.println(i++);//输出5
        System.out.println(i);//输出6

        int j=5;
        System.out.println(++j);//输出6
        System.out.println(j);//输出6
    }




    /**
     * 自增++置前置后测试测试,j的值为多少
     *
     */
    private void autoIncrementTest(){
        int i=1;
        int j=++i + i++ + ++i + ++i + i++;
        System.out.println("autoIncrementTest:"+j);
    }











}