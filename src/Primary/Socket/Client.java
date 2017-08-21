package Primary.Socket;

import java.io.*;
import java.net.Socket;

public class Client {
    public static final String IP_ARRD="127.0.0.1";
    public static final int PORT=8889;

    public static void main(String[] args) throws IOException {

        try {
            while (true){
                Socket  socket=new Socket(IP_ARRD,PORT);
                //输入数据并发送
                OutputStream outputStream=socket.getOutputStream();
                //使DataOutputStream装饰OutputStream;
                DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
                String string=new BufferedReader(new InputStreamReader(System.in)).readLine();
                dataOutputStream.writeUTF(string);
                dataOutputStream.close();
                //获取服务器返回数据
                InputStream inputStream=socket.getInputStream();
                DataInputStream dataInputStream=new DataInputStream(inputStream);
                String returnMsg=dataInputStream.readUTF();
                System.out.println("服务端返回的数据:"+returnMsg);
                dataInputStream.close();
                inputStream.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }


    }
}
