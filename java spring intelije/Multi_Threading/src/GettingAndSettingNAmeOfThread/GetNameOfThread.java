package GettingAndSettingNAmeOfThread;

import java.sql.SQLOutput;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("run method executed : "+Thread.currentThread().getName());
    }
}
public class GetNameOfThread {
    public static void main(String[] args) {
        MyThread t=new MyThread();

        t.start();
        System.out.println("main method is executed by : " +Thread.currentThread().getName());
        System.out.println(t.getName());
    }

}
