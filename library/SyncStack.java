package library;

/*定义一个栈模拟缓冲区*/
class SyncStack {
    int index=0;//栈中剩余元素个数，地址值
    Book[] arrB=new Book[3];//书容量的数组，容量为3
    /*
     * push定义为synchronized类型的，避免书的产生和地址的增加不同步
     */
    public synchronized void push(Book b) {
        while(index==arrB.length) {  //当栈满时，进入wait等待
            try {
                this.wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();//唤醒当前进程
        arrB[index]=b;
        index++;   //书本+1
        System.out.println("剩余书本数：" +index);
    }
    /*
     *
     * pop方法同样为synchronized类型
     */
    public synchronized Book pop() {
        while(index==0) {
            try {
                this.wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index--;//书本-1
        System.out.println("剩余书本数：" +index);
        return arrB[index];
    }
}