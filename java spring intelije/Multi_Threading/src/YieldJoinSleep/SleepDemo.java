package YieldJoinSleep;

class Mythread1 implements Runnable
{
    @Override
    public void run() {
        try{
            for (int i = 0; i <10 ; i++) {
                System.out.println("child thread");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted ");
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        Mythread1 mythread1=new Mythread1();
        Thread thread=new Thread(mythread1);
        thread.start();
        thread.interrupt();

        Runnable r1=()->{
            for (int i = 0; i <1000 ; i++) {
                System.out.println("child thread 2");
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread1=new Thread(r1);
        thread1.start();
        thread1.interrupt();
    }
}
