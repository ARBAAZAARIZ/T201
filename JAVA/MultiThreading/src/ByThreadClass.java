
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i < 40; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}





public class ByThreadClass {
    public static void main(String[] args) {
        MyThread3 mt3=new MyThread3();
        MyThread4 mt4=new MyThread4();
        mt3.start();
        mt4.start();
    }

}
