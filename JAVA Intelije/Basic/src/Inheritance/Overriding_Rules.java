package Inheritance;
class X{
    final void im_final(){
        System.out.println("I am final");
    }

    static void im_static(){
        System.out.println("I am static ");
    }
    int add(){
        return 10;
    }
}
class Y extends X{
    int add(){
        return 20;
    }

//    final void im_final(){                 cannot over ride final method
//        System.out.println("I am final");
//    }


}
public class Overriding_Rules {
    public static void main(String[] args) {
        Y y=new Y();
        y.im_static();
    }
}
