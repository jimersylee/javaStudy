package JVM.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致的内存溢出异常,适用版本jdk1.6,1.8已经去除永久代
 * @author jimersylee
 * VM Args: -XX:PermSize=10m -XX:MaxPermSize=10m
 * String.intern()是一个Native方法,它的作用是:如果字符串常量池中已经包含一个等于此String对象的字符串,则返回代表池中这个字符串的String对象;否则,将此String对象包含的字符串添加到常量池中,并且返回此String对象的引用
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args){
        //使用List保持着常量池引用,避免Full GC回收常量池行为
        List<String> list=new ArrayList<>();
        //10MB的PermSize在Integer范围内足够产生OOM了
        int i=0;
        while (true){
            list.add(String.valueOf(i++).intern());
            System.out.println(list.size());
        }

    }
}
