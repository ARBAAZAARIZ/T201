package CursorsPrograms;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListIteratorProgram {
    public static void main(String[] args) {
        LinkedList t=new LinkedList();
        t.add(20);
        t.add(33);
        t.add(62);
        t.add(11);
        t.add(50);
        System.out.println(t);

        ListIterator li=t.listIterator();
        while(li.hasNext()){
            Integer nextElement=(Integer) li.next();
            if(nextElement%2 !=0){
                System.out.println(nextElement);  //[20,33,62]
            }
            else{
                li.remove();
            }
        }
        System.out.println(t);


            
    }
}
