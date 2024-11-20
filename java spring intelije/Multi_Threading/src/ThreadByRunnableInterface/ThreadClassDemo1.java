package ThreadByRunnableInterface;

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("run method called by child thread");
    }
}

public class ThreadClassDemo1 {
    public static void main(String[] args) {
        MyRunnable1 r=new MyRunnable1();

        Thread t1=new Thread(r);
        Thread t2=new Thread();
        t1.start();
        System.out.println("this line executed by main thread");
        t2.run();
//        r.start();
    }
}
