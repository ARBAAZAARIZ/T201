package Static_Modifier;

public class College {
    public static void main(String[] args) {
//        Department d=new Department(); --> throws erroe as we we havent taken heklp from outer class object
//        so first make outer class object and use outer class object to make inner non stataic class object

        College college =new College();
        College.Department department=college.new Department(); // here we have takn the help of outer classs object
//        (college) to make inner class object
        department.department_method();

        Teacher teacher=new Teacher(); // here we can directly make object of static class
        teacher.teacher_method();

  }
//    bellow class is not a static class so we cannot create object directly by the name of inner class we
//    first need object of outer class the with the help of outer class objet we can create object of inner class
    class Department{
        void department_method(){
            System.out.println("I am department and present in non static class");
        }
    }
//    bellow class is a static class so its object can be created with out the need of outer class
    static class Teacher{
        void teacher_method(){
            System.out.println("I am teacher present in static method");
        }
    }
}
