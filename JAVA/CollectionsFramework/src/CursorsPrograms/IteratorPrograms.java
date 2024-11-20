package CursorsPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorPrograms {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList<>();
        list.add("arbaaz");
        list.add("aariz");
        list.add("shagufta");
        list.add("naziya");
        list.add("ashmira");
        list.add("fahin");

        System.out.println(list);

        Iterator i=list.iterator();
        while(i.hasNext()){
            String s=(String) i.next();
            if(s.charAt(0)=='a'){
                System.out.println(s);
            }
            else{
                i.remove();
            }
        }
        System.out.println(list);
    }
}
