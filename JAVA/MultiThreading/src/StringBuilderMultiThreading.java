public class StringBuilderMultiThreading {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hi");
        Runnable thread1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sb.append("i");
                }
            }
        };

        Runnable thread2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sb.append("H");
                }
            }
        };
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start();
        t2.start();


    }

}
