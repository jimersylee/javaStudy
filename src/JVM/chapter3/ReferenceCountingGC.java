package JVM.chapter3;

import java.lang.ref.SoftReference;

/**
 * testGC()方法执行后,objA和ObjB会不会被GC呢
 */
public class ReferenceCountingGC {
    public Object instance=null;
    private static final int _1MB=1024*1024;
    /**
     * 这个成员属性的唯一意义就是占点内存,以便能在GC日志中看清除是否被回收过
     */
    private byte[] bigSize=new byte[2*_1MB];

    public static void main(String[] args){
        ReferenceCountingGC objA=new ReferenceCountingGC();
        ReferenceCountingGC objB=new ReferenceCountingGC();
        objA.instance=objB;
        objB.instance=objA;
        objA=null;
        objB=null;
        //假设在这行发生GC,objA和objB能否被回收
        System.gc();
        SoftReference<String> softReference=new SoftReference<>("2222");
        String sss=softReference.get();
        String www= "2222";

        /*
        [GC (System.gc()) [PSYoungGen: 6747K->416K(51200K)] 6747K->416K(168960K), 0.0016519 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (System.gc()) [PSYoungGen: 416K->0K(51200K)] [ParOldGen: 0K->380K(117760K)] 416K->380K(168960K), [Metaspace: 3247K->3247K(1056768K)], 0.0121523 secs] [Times: user=0.01 sys=0.00, real=0.02 secs]
        * */
    }
}
