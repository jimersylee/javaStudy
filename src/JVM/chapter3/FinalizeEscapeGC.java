package JVM.chapter3;

/**
 * 此代码演示了两点
 * 1.对象可以在被GC时自我拯救
 * 2.这个自救机会只有一次
 *
 * @author jimersylee
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive() {
        System.out.println("yes,i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new FinalizeEscapeGC();
        //对象第一次成功拯救自己演示

        //释放对象
        SAVE_HOOK = null;
        System.gc();
        //因为finalize方法优先度低,所以暂停0.5秒等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no,i am dead :(");
        }

        //下面这段代码与上面的完全相同,但是这次自救却失败了
        SAVE_HOOK = null;
        System.gc();
        //因为finalize方法优先度低,所以暂停0.5秒等待它
        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        } else {
            System.out.println("no,i am dead :(");
        }
    }
}
