package QueueCollection;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class DQueueProgram {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.offer("Alfiya");

        ad.offerFirst("Arbaaz");
        ad.addFirst("Aariz");
        ad.offer("Tejas");
        ad.offerLast("Subham");
        ad.addLast("Dubey");
        ad.offerLast("Vishal");
        System.out.println(ad);

        ad.poll();
        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);

    }
}
