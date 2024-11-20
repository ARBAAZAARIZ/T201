package YieldJoinSleep;



public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        Runnable r1 = () -> {
            try {
                // Child thread waits for the main thread to complete
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i <= 10; i++) {
                System.out.println("seetha thread");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("ramu thread");
        }
    }
}

