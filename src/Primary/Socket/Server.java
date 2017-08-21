package Primary.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket服务端
 */
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket=new ServerSocket(8889);

        try {
            while (true){
                Socket client=serverSocket.accept();
                InputStream inputStream=client.getInputStream();
                //使用DataInputStream装饰inputSteam
                DataInputStream dataInputStream=new DataInputStream(inputStream);
                //使用readUTF读取内容
                String msg=dataInputStream.readUTF();
                System.out.println(msg);
                //向客户端回复消息
                DataOutputStream dataOutputStream=new DataOutputStream(client.getOutputStream());
                dataOutputStream.writeUTF("服务端收到消息:"+msg);
                dataOutputStream.close();
                dataInputStream.close();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }

    }
}
