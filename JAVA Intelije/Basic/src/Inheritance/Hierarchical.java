package Inheritance;

class parent{
    String name="raj";
        }
        class child1 extends parent{

        }
        class child2 extends parent{

        }
public class Hierarchical {
    public static void main(String[] args) {
        child1 c1=new child1();
        child2 c2=new child2();
        System.out.println(c1.name);
        System.out.println(c1.name);
    }

}
