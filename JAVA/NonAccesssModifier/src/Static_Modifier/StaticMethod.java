package Static_Modifier;

// static method is used to work with static members of class (like variable and methods)
// we can call static method directly without cteate object or without creating classname object
// we can call static method from non statc method also
class Parentclass{
    static void print(){
        System.out.println("I am static and present in parentclass");
    }
}
class Childclass extends Parentclass{
    void method1(){
        System.out.println("I am method 1 in child class");
    }
    static void print(){

        System.out.println("I am static method present in child class overriden by child class");

    }
}

public class StaticMethod {
    static String name ="Arbaaz";
    int age=21;
    static void display(){
        System.out.println(name);
//        System.out.println(age); throws error as we cannot use non static members in static members
//        i_am_not_static_method(); this is also a non static method so it will throw error
    }
    void i_am_not_static_method(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        StaticMethod sm=new StaticMethod();
//        sm.display();// as this lines shows warning because it is recomemded that static method should be called
////                by its name only
//        sm.i_am_not_static_method();
//        display();
        Childclass cc=new Childclass();
        cc.method1();
        Parentclass.print();
        Childclass.print();
    }
}
