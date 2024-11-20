package InterfaceInJava;
// in interface all methods are considered as abstract and if we dont define there access modifir like void method1 only the
//by default it considered as public access modifier
interface  class1{
    void method1();
    default void method2(){
        System.out.println("I am default method 2 present in interface ");
    }
}
class class2 implements class1{

    @Override
    public void method1() {
        System.out.println("i am method 1 overridden by class 2");
    }

    @Override
    public void method2() {
        System.out.println("i am method 2 overridden by class 2");

    }
}
public class InterfaceTestClass {
    public static void main(String[] args) {
        class2 test=new class2();
        test.method1();
        test.method2();
    }
}
