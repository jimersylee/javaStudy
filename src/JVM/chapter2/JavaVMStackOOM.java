package JVM.chapter2;

/**
 * 创建线程导致内存溢出异常
 * VM Args: -Xss2M
 * @author Jimersy Lee
 * todo:没有等到抛出异常
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        int count=0;
        while(true){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
            System.out.println(count++);
        }
    }
    public static void main(String[] args){
        JavaVMStackOOM oom=new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
