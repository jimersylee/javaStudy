package Primary.NumberString;

/**
 * 字符
 * Created by Jimersy Lee on 2017/4/5.
 */
public class Char {
    public static void main(String[] args){
        Char c=new Char();
        c.char1();
        c.characterMethod();
        c.wrapperClass();
    }

    /**
     * 保存一个字符的时候使用char
     */
    private void char1(){
        char c1='a';
        //字符1而非数字1
        char c2='1';
        //汉字
        char c3='中';
        //只能放一个字符
        //char c4='ab';
    }

    /**
     * char对应的封装类
     */
    private void wrapperClass(){
        char c1='a';
        //自动装箱
        Character c=c1;
        //自动拆箱
        c1=c;
    }

    /**
     * Character常见方法
     */
    private void characterMethod(){
        //判断是不是字母
        System.out.println(Character.isLetter('a'));
        //判断是不是数字
        System.out.println(Character.isDigit('a'));
        //判断是不是空白
        System.out.println(Character.isWhitespace(' '));
        //判断是不是大写
        System.out.println(Character.isUpperCase('A'));
        //判断是不是小写
        System.out.println(Character.isLowerCase('A'));
        //转换为大写
        System.out.println(Character.toUpperCase('b'));
        //转换为小写
        System.out.println(Character.toLowerCase('B'));
        //不能把一个字符转换成字符串
        //String a='a';
        //字符转换为字符串
        String a2=Character.toString('c');
    }
}
