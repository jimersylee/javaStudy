package Primary.Date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jimersy Lee on 2017/7/3.
 */
public class DateTest {

    public static void main(String[] args) {
        DateTest test = new DateTest();
        test.createDateObj();
        test.getTime();
    }

    //创建时间对象
    public void createDateObj() {
        //当前时间
        Date date1 = new Date();
        System.out.println("当前时间:");
        System.out.println(date1);
        //从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date date2 = new Date(5000);
        System.out.println("从1970年1月1日,8:00:00 经历了5秒的时间");
        System.out.println(date2);

    }

    /**
     * 获取时间戳
     */
    public void getTime() {
        //getTime()得到一个long型的整数,这个整数代表从1970.1.1 8:00:00 开始,每经历一毫秒,增加1
        Date now = new Date();
        System.out.println("time now:" + now.toString());
        System.out.println("当前时间getTime()的返回值是:" + now.getTime());
        Date zero = new Date();
        System.out.println("用0作为构造方法,得到的日期是:" + zero);
    }

    /**
     * 时间格式转换
     */
    public void formart() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date d = new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过yyyy-MM-dd HH:mm:ss SSS格式化后的输出:" + str);


        Date d1 = new Date();
        String str1 = sdf.format(d1);






    }
}
