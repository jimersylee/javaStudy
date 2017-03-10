package Operator;

/**
 * 位操作符
 * Created by Jimers Lee on 2017/3/9.
 */
public class BitwiseOperator {
    public static void main(String [] args){
        BitwiseOperator bo=new BitwiseOperator();
        bo.Or();
        bo.And();
        bo.not();
        bo.XOR();
        bo.moveLeftRight();
        bo.stopOuterLoop();
    }

    /**
     * 位或 |
     */
    public void Or(){
        int i=5; // 101
        int j=6; // 110
        System.out.println(i|j);//111=>7 对二进制进行每一位的或运算
    }

    /**
     * 位与 &
     */
    public void And(){
        int i=5; // 101
        int j=6; // 110
        System.out.println(i&j); //100=>4  对每一位进行与运算
    }

    /**
     * 异或 ^
     */
    public void XOR(){
        int i=5; // 101
        int j=6; // 110
        System.out.println(i^j); //011=> 对每一位进行异或运算

        //特殊情况
        //任何数与0异或都等于自己
        //任何数与自己异或都等于0
        System.out.println(i^0);
        System.out.println(i^i);
    }

    /**
     * 取非 ~
     */
    public void not(){
        int i=5; //00000101
        System.out.println(~i); //取非,每一位的非,则为11111010 即为-6

    }

    /**
     * 左移 << 右移 >>
     */
    public void moveLeftRight(){
        int i=6; //110
        System.out.println(i<<1);//左移一位,最右边一位补0 为1100=>12;
        System.out.println(i>>1);//右移一位,11=>3;
    }

    /**
     * 通过标签结束外部循环,break只能结束所处的第一层循环
     */
    public void stopOuterLoop(){
        outLoop:
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(0==j%2){
                    break outLoop;
                }
            }
        }
    }

}
