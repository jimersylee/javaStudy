package Primary.NumberString;

/**
 * 字符串转换
 * Created by Jimersy Lee on 2017/4/5.
 */
public class StringTest {
    public static void main(String[] args){
        StringTest st=new StringTest();
        st.numberToString();
        st.stringToNumber();
    }

    /**
     * 数字转字符串
     */
    private void numberToString(){
        int i=5;
        //方法1
        String str=String.valueOf(i);
        //方法2
        Integer it=i;
        String str2=it.toString();
    }

    /**
     * 字符串转数字
     */
    private void stringToNumber(){
        String str="999";
        int i=Integer.parseInt(str);
    }



}
