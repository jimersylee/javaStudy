package Array;


/**
 * 数组
 * Created by Jimers Lee on 2017/3/9.
 */
public class Array {

    public static void main(String[] args) {
        Array a=new Array();
        a.create();
        a.setValue();
        a.bubble();
        a.choseSort();
        a.arrayCopy();
        a.arrayCombine();
        a.twoDimensionalArray();

    }

    /**
     * 只创建数组
     */
    private void create(){
        //声明一个数组的引用
        int a[];
        //创建一个长度是5的数组,并且使用a引向该数组
        a = new int[5];
        //直接创建一个长度是5的数组并引用
        int b[]=new int[5];

        System.out.println("create"+a.length);
    }


    /**
     * 创建数组并赋值
     */
    private void setValue(){
        //写法一,分配空间并赋值
        int a[]=new int[]{1,2,3,4,5};
        //写法二,省略了new
        int b[]={1,2,3,4,5};
        //写法三
        //int c[]=new int[3]{1,2,3}; //错误,如果指定了数组的内容,就不能同时设置数组的长度

        for(int i=0;i<a.length;i++){
            System.out.println("setValue"+a[i]);
        }
        System.out.println("setValue");
    }

    /**
     * 冒泡排序
     */
    private void bubble(){
        int a[]={18,62,68,22,33};
        int temp;

        for (int j=0;j<a.length;j++){
            for(int i=0;i<a.length-1-j;i++){
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("bubble");


    }

    /**
     * 选择排序
     */
    private void choseSort(){
        int a[]={18,62,68,22,33};
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("choseSort");

    }

    /**
     * 数组复制
     */
    private void arrayCopy(){
        int a[]=new int[]{1,2,3,4,5,6};
        int b[]=new int[3];
        //传统方法for循环
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
        }

        //方法二 使用系统的数组复制函数 System.arraycopy(src,srcPos,dest,destPos,length);
        System.arraycopy(a,0,b,0,3);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("arrayCopy");
    }

    /**
     * 数组合并
     */
    private void arrayCombine(){
        int a[]=new int[]{1,2,3,4,5,6};
        int b[]=new int[]{7,8,9,10};
        int c[]=new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println("arrayCombine");
        for (int each:c){
            System.out.print(each+" ");
        }

    }

    /**
     * 二维数组
     */
    private void twoDimensionalArray(){
        //初始化二维数组
        System.out.println("twoDemensionalArray");
        int a[][]=new int[2][3];//有两个一维数组,每一个数组的长度是3
        a[1][2]=5;//可以直接访问一维数组,因为已经分配了空间

        int b[][]=new int[2][];
        b[0]=new int[3];
        b[0][2]=5;

        int c[][]=new int[][]{
                {1,2,3},
                {6,7,8,9},
                {2,4}
        };
        System.out.println(c[2][0]);


    }






}
