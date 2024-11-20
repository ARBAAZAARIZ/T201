package SortedSetCollection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparableDemoTreeSet {

    public static void main(String[] args) {

        TreeSet<Employee> employees=new TreeSet<>(new EmployeeComparator());
        employees.add(new Employee(3,"arbaaz"));
        employees.add(new Employee(10,"aariz"));
        employees.add(new Employee(5,"alfiya"));
        employees.add(new Employee(4,"alam"));
        employees.add(new Employee(3,"sufiyan"));
        employees.add(new Employee(1,"aayan"));

        System.out.println(employees);
//        output by default natural sorting order by comparable class
//        [id : 1  name : aayan, id : 3  name : arbaaz,
//        id : 3  name : sufiyan, id : 4  name : alam,
//        id : 5  name : alfiya, id : 10  name : aariz]

//        output by using custumized sorting
//        [id : 10  name : aariz, id : 1  name : aayan,
//        id : 4  name : alam, id : 5  name : alfiya,
//        id : 3  name : arbaaz, id : 3  name : sufiyan]
    }
}

class EmployeeComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee) o1;
        Employee e2=(Employee) o2;

        return e1.getName().compareTo(e2.getName());
    }
}
