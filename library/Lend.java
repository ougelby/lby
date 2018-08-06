package library;

//借书（消费者）的线程类
class Lend implements Runnable {
    SyncStack ss = null;

    Lend(SyncStack ss) {
        this.ss = ss;
    }

    public void run() {
        for (int i = 0; i < 6; i++) {  //固定借书6次
            Book b = new Book(i);
            ss.pop();  //使用栈
            System.out.println("借书" + b);
            try {
                Thread.sleep(2000);//每借书一次sleep 2 s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}