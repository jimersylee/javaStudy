package TypeTransfer;

/**
 * 类型强制转换
 * Created by Jimers Lee on 2017/3/8.
 */
public class casts {

    public static void main(String [] args){
        byte b=5;
        int i1=10;
        int i2=300;
        b=(byte)i1;
        //因为i1的值在byte范围之内，所以即便进行强制类型转换,最后得到的值也是10
        System.out.println(b);

        //因为i2的值在byte范围之外,所以会按照byte的长度进行截取,i2的值是300,对应的二进制数十100101100,按byte的长度8位进行截取后,其值为00101100,即44
        b=(byte)i2;
        System.out.println(b);

        //查看一个整数对应的而精致的方法
        System.out.println(Integer.toBinaryString(i2));


    }
}
