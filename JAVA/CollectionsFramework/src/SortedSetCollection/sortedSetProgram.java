package SortedSetCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSetProgram {

    public static void main(String[] args) {
        SortedSet<Integer> sortedSet=new TreeSet();
        sortedSet.add(1);
        sortedSet.add(7);
        sortedSet.add(17);
        sortedSet.add(-7);

        sortedSet.add(54);
        sortedSet.add(32);
        sortedSet.add(12);
        sortedSet.add(98);
        sortedSet.add(2);

        System.out.println(sortedSet);
    }
}
