package Primary.NameRule;

/**
 * 命名规则
 * * Created by Jimers Lee on 2017/3/8.
 */
public class NameRule {
    //1.变量命名只能使用字母 数字 $ _
    //变量第一个字符不能使用数字
    int a=5;
    int a_12=5;
    int _www=1;
    int a123=5;
    //int 1a=1; //非法

    //2.变量命名,尽量使用完整的单词,比如name,moveSpeed,而不是使用缩写n,ms
    String name;
    float hp;
    float armor;
    float moveSpeed;

    //3.不能只是用关键字,但是可以包含关键字
    //比如 int,short

    // int int; 非法
    int int1;//合法
    int class2;

    /*关键字列表
    * 异常处理 try catch finally throw throws
    * 字面值常量  false true null
    * 方法相关 return void
    * 对象相关 class new extends implements instanceof this super
    * 包相关 package import
    * 未使用的 const goto
    * 基本数据类型 byte short int long float double char boolean
    * 循环关键字 do while for break continue
    * 分支关键字 if else elseif switch case default
    * 方法,变量和类修饰符 private public protected final static abstract synchronized transient volatile strictfp
    * */


}
