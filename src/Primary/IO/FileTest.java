package Primary.IO;

import java.io.File;
import java.util.Date;

/**
 * 文件IO测试
 * Created by Jimersy Lee on 2017/4/1.
 */
public class FileTest {
    static long maxSize= Integer.MIN_VALUE;
    static long minSize=Integer.MAX_VALUE;
    static File minFile=null;
    static File maxFile=null;


    /**
     * 找出某文件夹下最大最小的文件
     */
    public void findMaxMinFile(){
        File f=new File("c:/windows");
        listFiles(f);
        System.out.printf("最大的文件是%s,大小是%d字节%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("最小的文件是%s,大小是%d字节%n",minFile.getAbsoluteFile(),minFile.length());

    }

    /**
     * 递归遍历文件
     * @param file
     */
    private void listFiles(File file){
        if(file.isFile()){
            if(file.length()>maxSize){
                maxSize=file.length();
                maxFile=file;
            }
            if(file.length()!=0 && file.length()<minSize){
                minSize=file.length();
                minFile=file;
            }
        }else {
            File[] fileArr=file.listFiles();
            if(null==fileArr){
                return;
            }

            for (File f:fileArr
                 ) {
                listFiles(f);
            }
        }



    }

    public static void main(String[] args){

        FileTest ft=new FileTest();
        long time=System.currentTimeMillis();
        ft.findMaxMinFile();
        System.out.printf("耗时:%d毫秒",System.currentTimeMillis()-time);

        /*ft.createFileObj();
        ft.getFileInfo();
        ft.dir();*/
    }


    /**
     * 创建文件对象
     */
    void createFileObj(){
        //绝对路径 使用/
        File f1=new File("d:/LOLFolder");
        System.out.println("f1的绝对路径:"+f1.getAbsolutePath());
        //相对路径,相对与工作目录,如果在idea中,就是项目目录
        File f2=new File("LOL.exe");
        System.out.println("f2的绝对路径:"+f2.getAbsolutePath());
        //把f1作为父目录创建文件对象
        File f3=new File(f1,"LOL.exe");
        System.out.println("f3的绝对路径:"+f3.getAbsolutePath());

    }

    /**
     * 获取文件信息
     */
    void getFileInfo(){
        File f=new File("d:/study/javaStudy/src/Primary/IO/lol.file");
        System.out.println("当前文件是"+f);
        //文件是否存在
        System.out.println("判断是否存在:"+f.exists());
        //是否是文件夹
        System.out.println("是否是文件夹:"+f.isDirectory());
        //文件长度
        System.out.println("获取文件的长度:"+f.length());
        //文件最后修改时间
        long time=f.lastModified();
        Date date=new Date(time);
        System.out.println("文件最后的修改时间:"+date);
        //设置文件的修改时间
        boolean bResult=f.setLastModified(0);
        System.out.println("是否设置成功:"+bResult);
        //文件重命名
        File f2=new File("d:/study/javaStudy/src/Primary/IO/dota.file");
        bResult=f.renameTo(f2);
        System.out.println("把lol改成dota是否成功:"+bResult);

    }

    /**
     * 文件目录与创建文件,目录相关测试
     */
    void dir(){
        File file=new File("d:/study/javaStudy/src/Primary/IO");
        //以字符串数组的形式,返回当前文件夹下的所有文件,不包含子文件及子文件夹
        String[] list=file.list();
        //以文件数组的形式,返回当前文件夹下的所有文件
        File[] fileArray= file.listFiles();

        //以字符串形式返回获取所在文件夹
        String parentDir=file.getParent();
        //以文件形式返回获取所有文件夹
        File parentFile=file.getParentFile();

        //创建文件夹,如果父文件夹不存在,则创建无效
        file.mkdir();

        //创建文件夹,如果父文件夹不存在,则创建父文件夹
        file.mkdirs();

        //创建一个空文件,如果父文件夹不存在,就会抛出异常
        try {
            file.createNewFile();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //所以创建文件前,通常会创建父目录
        file.getParentFile().mkdirs();
        //列出所有盘符
        file.listRoots();
        //删除文件
        file.delete();
        //jvm结束的时候,删除文件,常用于临时文件的删除
        file.deleteOnExit();

    }



}
