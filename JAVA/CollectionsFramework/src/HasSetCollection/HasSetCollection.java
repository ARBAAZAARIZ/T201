package HasSetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HasSetCollection {
    public static void main(String[] args) {
        System.out.println("-------------------HashSet------------------");
        HashSet <Integer> hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add(50);
        hashSet.add(20);
        hashSet.add(120);
        hashSet.add(200);
        hashSet.add(10);
        hashSet.add(109);
        hashSet.add(10);
        System.out.println(hashSet);

        System.out.println("-------------------linkedHashSet------------------");
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(50);
        linkedHashSet.add(20);
        linkedHashSet.add(120);
        linkedHashSet.add(200);
        linkedHashSet.add(10);
        linkedHashSet.add(109);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);

        System.out.println("-------------------treeSet------------------");
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(120);
        treeSet.add(200);
        treeSet.add(10);
        treeSet.add(109);
        treeSet.add(10);
        System.out.println(treeSet);

    }
}
