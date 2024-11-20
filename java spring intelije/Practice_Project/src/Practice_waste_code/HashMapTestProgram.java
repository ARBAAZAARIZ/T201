package Practice_waste_code;

import User_define_Objects.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTestProgram {
    public static void main(String[] args) {

        HashMap<Integer, Employee> emp=new HashMap<>();
        Employee s1= new Employee(101,"arbaaz",400000);
        emp.put(1,s1);
        Employee e=emp.get(1);
//        System.out.println(e.getId()+e.getName()+e.getSalary());

        emp.put(2, new Employee(102,"aariz",450000));
        emp.put(3, new Employee(103,"alfiya",329000));
        emp.put(4, new Employee(104,"aayan",569900));
        emp.put(5, new Employee(105,"arzoo",400000));
        System.out.println(emp);

        Iterator<Map.Entry<Integer,Employee>> empIterator=emp.entrySet().iterator();
        while(empIterator.hasNext()){
            System.out.println(empIterator.next());
        }
        System.out.println(emp.values());

    }
}
