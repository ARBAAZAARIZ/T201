import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee thatEmployee) {
        return this.salary > thatEmployee.salary ? 1 : -1 ;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        Employee e1=new Employee("Arbaaz", 600000);

        List<Employee> employelist =new ArrayList<>();
        employelist.add(e1);
        employelist.add(new Employee("Aariz", 450000));
        employelist.add(new Employee("Ashmira", 356000));

        for(Employee e : employelist){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("NAME   :  SALARY" );
        for(Employee e:employelist){
            System.out.println(e.name + " : " + e.salary);
        }

//        Collections.sort(employelist); ERROe here sort will not work as it
//        work only on primitive data type

//        Comparator<Employee> comparator=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//               return e1.salary>e2.salary ? 1 : -1;
//            }
//        };
//
//        Collections.sort(employelist,comparator); // here sort will work
//        // as w have provided custom sorting
//        System.out.println("------sorted based on salary----------");
//
//        for(Employee e:employelist){
//            System.out.println(e.name + " : " + e.salary);
//        }
        Collections.sort(employelist);
        System.out.println();
        System.out.println("NAME   :  SALARY" );
        for(Employee e:employelist){
            System.out.println(e.name + " : " + e.salary);
        }

    }


}
