package Methods;

public class Student {

//    static variable

//    1.the value of variable is same for all over class and for all objects
//    is called as static variable
//    2. we can access static variable using reference variable, but it is recommended to use class name


//    instance variable
//    1.the vale of variable is changing from object to object is called instance variable
//     as instance variable ex.student name
//    2.we can access instance variable using reference variable


//    constructor
//    1. it is method in java
//    2.the name of constructor is same as class name
//    3.get executed automatically when object is created




    static String institute="ITV";
    int age;
    String name;
    Student(int s_age, String s_name){
        this.age=s_age;
        this.name=s_name;
    }
    public static void main(String[] args) {

         Student s1=new Student(20,"raj");
         Student s2=new Student(20,"rani");

        System.out.println(s1.name);// accessing instance variable/
        System.out.println(s2.age);// accessing instance variable

        System.out.println(s1.institute);
        System.out.println(s1.institute); // not a correct way to access the static variable

        System.out.println(Student.institute); // access the static variable by using class name



    }
}
