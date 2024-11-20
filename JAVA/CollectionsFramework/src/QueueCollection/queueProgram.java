package QueueCollection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class queueProgram {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();

//    to add values in pq use offer methodp

        pq.offer(16);
        pq.offer(39);
        pq.offer(34); // if memory is full then offer will not add elemnt and returns fals
        pq.add(3); // if memory is full then offer will not add elemnt and raise exception

        System.out.println(pq);
        System.out.println(pq.peek());

        pq.poll(); // removes head of the element
        System.out.println(pq.remove(3)); // removes specified element
        System.out.println(pq);


    }




}
