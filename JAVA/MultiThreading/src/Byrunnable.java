class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);  // this sleep thraed is checked error
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);  // this sleep thraed is checked error
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Byrunnable {
    public static void main(String[] args) {
        MyThread1 mt1=new MyThread1();
        Thread thread1=new Thread(mt1);
        MyThread2 mt2=new MyThread2();
        Thread thread2=new Thread(mt2);
        thread1.start();
        thread2.start();
    }
}
