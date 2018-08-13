package Client;

import java.io.*;
import java.net.*;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        /*
         * 思路：
         * 1、创建Socket客户端对象
         * 2、获取键盘录入的数据
         * 3、将录入的信息发送给Socket输出流
         */
        // 1、创建Socket客户端对象
        Socket s = new Socket("localhost", 10004);
        // 2、获取键盘录入
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        // 3、Socket输出流
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        //当输入over时，结束
        String line = null;
        while ((line = bufr.readLine()) != null) {

            if ("over".equals(line))
                break;
            out.println(line);
        }
        s.close();//关闭
    }
}