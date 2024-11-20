package Comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompCompDemo  {
    public static void main(String[] args) {
        Employee e1=new Employee(100, "shamia");
        Employee e2=new Employee(200, "naziya");
        Employee e3=new Employee(27, "arbaaz");
        Employee e4=new Employee(18, "aariz");
        TreeSet t1=new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(new Employee(70, "nitesh"));
        t1.add(new Employee(71, "niraj"));
        t1.add(new Employee(125, "rose"));
        t1.add(new Employee(70, "nitesh"));
        t1.add(new Employee(420, "darakshaa"));
        System.out.println("Using default natural sorting order Comparable " +
                "interface compareTo method increasing order of id");
        System.out.println(t1);
        System.out.println(t1.size());

//      creating customized sorting by using comparator interface
        Comparator myComparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1=(Employee) o1;
                Employee e2=(Employee) o2;
                String name1=e1.name;
                String name2=e2.name;
                return name1.compareTo(name2);
            }
        };
        Employee e5=new Employee(100, "shamia");
        Employee e6=new Employee(200, "naziya");
        Employee e7=new Employee(27, "arbaaz");
        Employee e8=new Employee(18, "aariz");
        TreeSet t2=new TreeSet(myComparator);
        t2.add(e5);
        t2.add(e6);
        t2.add(e7);
        t2.add(e8);
        t2.add(new Employee(70, "nitesh"));
        t2.add(new Employee(71, "niraj"));
        t2.add(new Employee(125, "rose"));
        t2.add(new Employee(70, "nitesh"));
        t2.add(new Employee(420, "darakshaa"));
        System.out.println("Using our own customized sorting order by using comparator interface " +
                "compare method increasing alphabetical order");
        System.out.println(t2);
        System.out.println(t2.size());

    }

}

