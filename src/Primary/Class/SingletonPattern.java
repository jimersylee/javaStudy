package Primary.Class;

/**
 * 单例模式
 * 什么是单例模式
 * 1.私有化构造函数
 * 2.静态属性指向实例
 * 3.public static getInstance()方法,返回第二部的静态属性
 * Created by Jimersy Lee on 2017/3/11.
 */
public class SingletonPattern {
    HungryMan h=HungryMan.getInstance();
    LazyMan l=LazyMan.getInstance();
}

/**
 * 饿汉型单例模式,在启动的时候就会创建
 */
class HungryMan{
    //私有化构造函数
    private HungryMan(){
    }
    //静态属性指向实例
    private static HungryMan instance=new HungryMan();
    //获取类实例
    public static HungryMan getInstance(){
        return instance;
    }
}

/**
 * 懒汉型单例模式,在第一次使用的时候才会创建
 */
class LazyMan{
    //私有化构造函数
    private LazyMan(){
    }
    //静态属性指向实例
    private static LazyMan instance=null;
    //获取类实例的方法
    public static LazyMan getInstance(){
        if(null==instance){
            instance=new LazyMan();
        }
        return instance;
    }
}








