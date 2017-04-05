package Primary.NumberString;

/**
 * 格式化输出
 * Created by Jimersy Lee on 2017/4/5.
 */
public class Format {
    public static void main(String[] args) {
        Format f=new Format();
        f.formatOut();
        f.printfAndFormat();
        f.newLine();
    }

    /**
     * 格式化输出,%s表示字符串,%d表示数字,%n表示换行
     */
    private void formatOut() {
        String name="盖伦";
        int kill=8;
        String title="超神";
        //直接使用+字符串连接,编码感觉会比较繁琐,并且维护性差,易读性差
        String sentence=name+"在进行了连续"+kill+"次击杀后,获得"+title+"的称号";
        System.out.println(sentence);
        //使用格式化输出
        String sentenceFormat="%s在进行了连续%d次击杀后,获得%s的称号";
        System.out.printf(sentenceFormat,name,kill,title);
    }

    /**
     * printf与format使用方式一样,结果一样
     * printf其实是直接调用了format
     *
     */
    private void printfAndFormat(){
        String name="盖伦";
        int kill=8;
        String title="超神";

        //使用printf输出
        String sentenceFormat="%s在进行了连续%d次击杀后,获得%s的称号";
        System.out.printf(sentenceFormat,name,kill,title);
        //使用format输出
        System.out.format(sentenceFormat,name,kill,title);
    }

    /**
     * 换行符
     * 换行符就是另起一行 --- '\n' 换行（newline）
     回车符就是回到一行的开头 --- '\r' 回车（return）
     在eclipse里敲一个回车，实际上是回车换行符
     Java是跨平台的编程语言，同样的代码，可以在不同的平台使用，比如Windows,Linux,Mac
     然而在不同的操作系统，换行符是不一样的
     （1）在DOS和Windows中，每行结尾是 “\r\n”；
     （2）Linux系统里，每行结尾只有 “\n”；
     （3）Mac系统里，每行结尾是只有 "\r"。
     为了使得同一个java程序的换行符在所有的操作系统中都有一样的表现，使用%n，就可以做到平台无关的换行
     */
    private void newLine(){
        System.out.println("这是换行符%n");
        System.out.println("这是换行符%n");
    }
}
