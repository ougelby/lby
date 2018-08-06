package library;

//还书（生产者）的线程类
class Give implements Runnable{
    SyncStack ss=null;
    Give(SyncStack ss) {
        this.ss=ss;
    }
    public void run() {
        for(int i=0;i<6;i++) {
            Book b=new Book(i);
            ss.push(b);  //使用栈
            System.out.println("还书"+b);
            try {
                Thread.sleep(1000); //每还书一次sleep 1 s
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
