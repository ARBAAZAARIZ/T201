package throw_Programs_package;
//with using throw keyword and without usng throw keyword

public class Case1 {
    void withOutUsingThrow(){
        System.out.println(10/0);
    }
    void withUsingThrow(){
        throw new ArithmeticException("Raised arithmetic exception");
//        System.out.println("hii");   unreachable statement

    }
    public static void main(String[] args) {
        Case1 throwClass1=new Case1();
//        throwClass1.withOutUsingThrow();
        throwClass1.withUsingThrow();

    }
}
