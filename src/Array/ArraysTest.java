package Array;
import java.util.Arrays;

/**
 * 数组工具类
 * Created by Jimersy Lee on 2017/3/11.
 */
public class ArraysTest {


    public static void main(String[] args) {
        ArraysTest at = new ArraysTest();
        at.copyOfRange();
        at.toStringTest();
        at.sort();
        at.binarySearch();
        at.fill();
    }

    /**
     * 数组复制
     */
    private void copyOfRange() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        //copyOfRange(int [] original,int from,int to)
        //第一个参数表示源数组;
        //第二个参数表示开始位置
        //第二个参数表示结束位置
        int b[] = Arrays.copyOfRange(a, 0, 3);
        System.out.println("copyOfRange");
        for (int each :
                b) {
            System.out.print(each + " ");
        }
        System.out.println("");
    }

    /**
     * 数组转化为字符串
     */
    private void toStringTest() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        System.out.println("toString");
        System.out.println(Arrays.toString(a));
    }

    /**
     * 数组排序
     */
    private void sort(){
        int a[]=new int[]{18, 62, 68, 82, 65, 9};
        System.out.println("sort");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 数组成员搜索,必须先使用sort()排序,当数组中有多个相同的值时,搜索到的位置不一定
     */
    private void binarySearch(){
        int a[]=new int[]{18, 62, 68, 82, 65, 9};
        System.out.println("binarySearch");
        Arrays.sort(a);
        System.out.println("数字62出现的位置:"+Arrays.binarySearch(a,62));
    }

    /**
     * 数组填充
     */
    private void fill(){
        int a[]=new int[10];
        Arrays.fill(a,5);
        System.out.println("fill");
        System.out.println(Arrays.toString(a));
    }









}
