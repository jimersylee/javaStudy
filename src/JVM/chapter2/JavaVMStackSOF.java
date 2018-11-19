package JVM.chapter2;

/**
 * 虚拟机和本地方法栈OOM测试(仅作为第一点测试程序)
 * VM Args:-Xss228k
 * @author Jimersy Lee
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }
    public static void main(String[] args) throws Throwable{
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+oom.stackLength);
            throw e;
        }
    }
}
