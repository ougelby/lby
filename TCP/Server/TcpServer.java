package Server;

import java.net.*;
import java.io.*;
public class TcpServer {
    public static void main(String[] args) throws IOException {
        /*
         * 思路：
         * 1、创建SeverSocket客户端对象
         * 2、获取Socket流
         * 3、通过Socket， 读取客户端发过来的内容
         * 4、显示在控制台上
         */
        // 1、创建SeverSocket对象
        ServerSocket ss = new ServerSocket(10004);
        // 2、获取Socket对象
        Socket s = ss.accept();
        // 获取IP地址
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "......connected");
        // 3、获取Socket读取流，并装饰
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 4、获取Socket的输出流，并装饰
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        //
        String line = null;
        while ((line = bufIn.readLine()) != null) {
            System.out.println(line);
            File file =new File("Server.txt");

            //判断是否有Server文件
            if(!file.exists()){
                file.createNewFile();
            }
            //文件的续写，把客户端的字符写到txt中
            FileWriter fileWritter = new FileWriter(file.getName(),true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(bufIn); //这里其实不太会了。。。把这句注释掉还是能运行，客户端可以连接上
            bufferWritter.close();
        }
        s.close();
        ss.close();//关闭
    }
}