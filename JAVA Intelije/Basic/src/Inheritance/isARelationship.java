package Inheritance;
class person{
    static String name;
    int age;

     person(int age,String ename) {
        this.age = age;
        name=ename;
    }
}
class employee extends person{
    int salary;
    employee(int age, String ename,int salary){
        super(age,ename);
        this.salary=salary;
    }
}
public class isARelationship
{
    public static void main(String[] args) {
       employee e1=new employee(21,"Arbaaz",30000000);
        System.out.println(e1.age);
        System.out.println(employee.name);
        System.out.println(e1.salary);
    }
}
