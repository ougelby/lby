package library;

public class Library{
    /*
     * 主函数
     * 一个还书（生产者），一个借书（消费者）
     */
    public static void main(String[] args) {
        SyncStack ss=new SyncStack();
        Give g=new Give(ss);
        Lend l=new Lend(ss);
        new Thread(g).start(); //线程开启
        new Thread(l).start();
    }
}





