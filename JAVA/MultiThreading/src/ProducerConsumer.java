import java.util.LinkedList;

public class ProducerConsumer {
    LinkedList<Integer> bucket= new LinkedList<>();
    int capacity=1;
    public void producer() throws InterruptedException {
        int producer_data=0;
        while(true)
        {
            synchronized (this){
                if(bucket.size()==capacity){
                    wait();
                }
                else{
                    System.out.println("Producer is producing ................");
                    System.out.println("Producer Produced" + producer_data);
                    bucket.add(producer_data++);
                    notify();
                }
            }
        }
    }
    public void consumer() throws InterruptedException {
        while(true)
        {
            synchronized (this)
            {
                if(bucket.isEmpty()){
                    wait();
                }
                else{
                    int consumed_data=bucket.removeFirst();
                    System.out.println("consumer is cConsuming .............");
                    System.out.println("consumer consumed " + consumed_data);
                    notify();

                }
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc=new ProducerConsumer();
        Runnable thread1=new Runnable() {
            @Override
            public void run() {
                try{
                    pc.producer();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Runnable thread2=new Runnable() {
            @Override
            public void run() {
                try{
                    pc.consumer();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1=new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
