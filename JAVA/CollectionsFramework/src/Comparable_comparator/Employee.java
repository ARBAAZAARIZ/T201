package Comparable_comparator;

public class Employee implements Comparable{
    int eid;
    String name;
    Employee(int eid, String name){
        this.eid=eid;
        this.name=name;
    }
    public int compareTo(Object obj){
        int eid1=this.eid;
        Employee e=(Employee)obj;
        int eid2=e.eid;
        return Integer.compare(eid1, eid2);
    }
    public String toString(){
        return name+" -- "+eid;
    }
}
