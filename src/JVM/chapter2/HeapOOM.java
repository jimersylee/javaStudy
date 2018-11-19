package JVM.chapter2;


import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author jimersylee
 */
public class HeapOOM {
    private static class OOMObject{

    }
    public static void main(String[] args){
        List<OOMObject> list=new ArrayList<>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
