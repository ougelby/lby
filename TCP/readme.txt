这次作业并没能完成，也许是知识储备还不够把,感觉自己逻辑上应该是想通了的。只完成了一些，客户端应该没问题
希望学长看后可以指导一下.

写一下自己的思路：
客户端：
1.创建Socket客户端对象
2.获取键盘录入的数据
3.将录入的信息发送给Socket输出流
4.用判断语句，输入over就结束


服务端：
1.创建SeverSocket客户端对象
2.获取Socket流
3.通过Socket， 读取客户端发过来的内容
4.显示在控制台上
5.通过Time函数获取当前时间
6.创建Server.txt文件，并用if语句判断是否存在Server.txt
7.将时间和收到的信息用FileWriter写入txt
8.用FileWriter时注意用参数true，保证内容不是覆盖
