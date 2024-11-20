package SortedSetCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> t=new TreeSet<>(new MyComparator1());
        t.add("raja");
        t.add("shobhaRani");
        t.add("rajaKumari");
        t.add("gangaBhavani");
        t.add("ramulamma");
        System.out.println(t);
    }
}
class MyComparator1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String) o1;
        String s2=(String) o2;

        return s2.compareTo(s1);

    }
}
