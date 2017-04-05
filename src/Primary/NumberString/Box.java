package Primary.NumberString;

/**
 * 装箱拆箱
 * Created by Jimersy Lee on 2017/4/5.
 */
public class Box {

    public static void main(String[] args) {
        Box b = new Box();
        b.wrapperClass();
        b.numberClass();
        b.numberMaxMin();
        b.basedTypeToWrapperClass();
        b.wrapperClassTobasedType();
        b.autoBoxing();
        b.autoUnboxing();

    }

    /**
     * 封装类
     */
    void wrapperClass() {
        int i = 5;
        //把一个基本类型的变量,转换为Integer对象
        Integer it = new Integer(i);
        int i2 = it.intValue();
        String s = it.toString();

    }

    /**
     * 数字封装类有Byte,Short,Integer,long,Float,Double
     */
    void numberClass() {
        int i = 5;
        Integer it = new Integer(i);
        //Integer是Number的子类,所以打印true;
        System.out.println(it instanceof Number);
    }

    /**
     * 基本类型转封装类
     */
    void basedTypeToWrapperClass() {
        int i = 5;
        Integer it = new Integer(i);
    }

    /**
     * 封装类转基本类型
     */
    void wrapperClassTobasedType() {
        int i = 5;
        Integer it = new Integer(i);
        int i2 = it.intValue();
    }

    /**
     * 自动装箱
     */
    void autoBoxing() {
        int i = 5;
        //自动转换就叫装箱
        Integer it2 = i;
    }

    /**
     * 自动拆箱
     */
    void autoUnboxing() {
        int i = 5;
        Integer it = i;
        //手动转换
        int i2 = it.intValue();
        //自动拆箱
        int i3 = it;
    }

    /**
     * 数字的最大值和最小值可以通过对应的封装类的MAX_VALUE,MIN_VALUE获取
     */
    void numberMaxMin() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }


}
