package JVM.chapter2;

/**
 * String.intern()返回引用测试
 * 对于中文来说,append后只有.toString()才第一出现"计算机软件",因此true
 * 对于英文来说,append后已经出现了"java",因此在toString()后,是第二次出现,因此false;
 */
public class StringIntern {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern()==str1);


        String str2=new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern()==str2);
    }
}
