package ThreadByThreadClass;

class MyThread1 extends Thread {
    public void start(){
        super.start();
        System.out.println("Start method call my main thread");
    }

    @Override
    public void run() {
        System.out.println("Run method called by thread class or by child class");
    }
}

public class ThreadTestDemo1 {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
        System.out.println("running main method");
    }

}
