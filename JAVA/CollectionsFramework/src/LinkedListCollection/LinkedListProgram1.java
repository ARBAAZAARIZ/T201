package LinkedListCollection;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListProgram1 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add("arbaaz");
        linkedList.add('a');
        System.out.println(linkedList);

        HashSet hashSet=new HashSet();
        hashSet.add(2);
        hashSet.add('q');
        hashSet.add("arbaaz");
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
