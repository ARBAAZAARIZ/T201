package Inheritance;
// if we want to access members (Variables or methods)of one class into another class
// those class must be in relationship - Has -A or Is -A relationship

//Has _A Relationship in has a relation ship we have to create object of
// class a into class class b to use members of class a here in has a
// relationship not all members are assible into classs b as privat is not assessible
public class HasARelationship {
    public static void main(String[] args) {
        A a=new A();
        int my_x=a.x;
        int my_y=a.y;
        System.out.println(my_x);
        System.out.println(my_y);
    }


}
class A{
    int x=10;
    int y=20;
}