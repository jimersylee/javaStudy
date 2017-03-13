package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 异常
 * Created by Jimersy Lee on 2017/3/13.
 */
public class TestException {
    public static void main(String[] args) {
        TestException te = new TestException();
        te.whatIsException();
        te.dealWithException();
        te.multipleExceptionCatch1();
        te.multipleExceptionCatch2();
        te.finallyTest();
        te.throwsTest();
    }

    /**
     * 什么是异常
     */
    public void whatIsException() {
        File file = new File("d:/lol.exe");
        //试图打开文件lol.exe会抛出FileNotFoundException,如果不处理该异常,就会有编译错误
        //new FileInputStream(file);
    }

    /**
     * 处理异常
     */
    public void dealWithException() {
        File file = new File("d:/lol.exe");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("找不到文件");
            //e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("关闭资源失败");
                }
            }
        }

        //使用异常的父类捕获异常,IoException是Exception的子类
        try {
            inputStream = new FileInputStream(file);
        } catch (Exception e) {
            System.out.println("Exception异常 " + e.getMessage());
        } finally {
            //无论是否异常,都会执行的代码
            System.out.println("无论是否异常都会执行的代码");
        }
    }

    /**
     * 多个异常捕捉方法1,多次catch
     */
    public void multipleExceptionCatch1() {
        File file = new File("d:/lol.exe");
        try {
            new FileInputStream(file);
            SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
            Date d = spd.parse("2016-1-1");
        } catch (IOException e) {
            System.out.println("文件打开失败");
        } catch (ParseException e) {
            System.out.println("时间解析失败");
        }
    }

    /**
     * 多个异常捕捉方法2,一次catch
     */
    public void multipleExceptionCatch2() {
        File file = new File("d:/lol.exe");
        try {
            new FileInputStream(file);
            SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
            Date d = spd.parse("2016-1-1");
        } catch (IOException | ParseException e) {
            if (e instanceof IOException) {
                System.out.println("文件打开失败");
            }
            if (e instanceof ParseException) {
                System.out.println("时间解析失败");
            }
        }
    }

    /**
     * finally关键字的使用
     */
    public void finallyTest() {
        File file = new File("d:/lol.exe");
        try {
            new FileInputStream(file);
        } catch (IOException e) {
            System.out.println("文件打开失败");
        } finally {
            System.out.println("无论如何都会执行的代码,此处可以写释放资源的代码");
        }
    }


    /**
     * 抛出测试,如果一个方法声明时添加了throws关键字,则此方法只会抛出一样
     */
    public void throwsTest() {
        method1();
    }

    private void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            System.out.println("打开失败");
        }
    }

    private void method2() throws FileNotFoundException {
        File file = new File("d:/lol.exe");
        System.out.println("试图打开");
        new FileInputStream(file);
        System.out.println("成功打开");
    }


}
