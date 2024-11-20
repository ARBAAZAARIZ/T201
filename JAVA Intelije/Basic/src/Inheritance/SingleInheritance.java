package Inheritance;

import org.w3c.dom.ls.LSOutput;

class Human{
     String name="Arbaaz";
}
class Student extends Human{

}
public class SingleInheritance {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
    }


}
