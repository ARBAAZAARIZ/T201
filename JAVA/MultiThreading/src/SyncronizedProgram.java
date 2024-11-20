import java.util.Random;

public class SyncronizedProgram {

    synchronized void firstThree(int start){
        for (int i = start; i <start+3 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SyncronizedProgram sm=new SyncronizedProgram();
//            sm.firstThree(20);
        Random r=new Random();


        Runnable thread1=new Runnable() {
            @Override
            public void run() {
                int start=r.nextInt(10);
                sm.firstThree(start);

            }
        };
        Runnable thread2=new Runnable() {
            @Override
            public void run() {
                int starts=r.nextInt(11,20);
                sm.firstThree(starts);
            }
        };

        Runnable thread3=new Runnable() {
            @Override
            public void run() {
                int starts=r.nextInt(11,20);
                sm.firstThree(starts);
            }
        };

       Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        Thread t3=new Thread(thread2);
       t1.start();
       t2.start();
       t3.start();



    }

}
