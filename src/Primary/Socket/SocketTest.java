package Primary.Socket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * socket
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        SocketTest t=new SocketTest();
        t.getIP();
        t.ping();
    }

    public void getIP() throws UnknownHostException {
        InetAddress ip4Host=Inet4Address.getLocalHost();
        InetAddress ip6Host= Inet6Address.getLocalHost();
        String ip4=ip4Host.getHostAddress();
        String ip6=ip6Host.getHostAddress();
        print("本机的IP4地址:"+ip4);
        print("本机的IP6地址:"+ip6);
    }

    public void ping() throws IOException {
        print("ping测试");
        Process process=Runtime.getRuntime().exec("ping "+"192.168.0.1");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        for(int i=0;i<4;i++){
            if((line=bufferedReader.readLine())!=null){
                if(line.length()!=0){
                print(line+"\r\n");
                }
            }
        }
    }












    public void print(Object o){
        System.out.println(o.toString());
    }
}
