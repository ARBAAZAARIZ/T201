package throw_Programs_package;

public class Case2 {
//    here e is assigned a object
    static ArithmeticException e=new ArithmeticException("e is assigned a object");

//    not assigning any object to a
    static ArithmeticException a;

    public static void main(String[]arg) {
//        throw e;
        throw a;  // --> here cannot throw any exception as e is null and
        // if a object is null it will throw nullPointerException only
    }
}
