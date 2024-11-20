package Final_modifier;

final class Test{

}
class Demo{
    final String name="Arbaaz";
    int age=21;

    void display(){
        System.out.println("I am display present in demo class");
        age=30;
//        name="Lol"; -- throws error as we cannot change the variable value which is final
    }
    final void show(){
        System.out.println("I am final method present in demo and cant be overridden ");
    }
}

//public class Employee extends Test { --> throws error as we cannot extends final  class
public class Employee extends Demo{
    public static void main(String[] args) {
        Employee e=new Employee();
    }
    void display(){
        System.out.println("I am display over ridden by employee class");
    }
}
