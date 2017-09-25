package JVM.chapter2;


/**
 * @author jimersylee
 * 记住CGLib使方法区出现内存溢出异常
 * VM Args:-XX:PermSize=10m,-XX:MaxPermSize=10m
 */
public class JavaMethodAreaOOM {
    public static void main(String[] args){
        while (true){

        }
    }
}
