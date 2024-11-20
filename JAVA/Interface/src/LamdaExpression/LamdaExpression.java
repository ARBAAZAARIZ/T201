package LamdaExpression;

interface Printer{
//    void print(String doc);
     String print(String doc);

}
//lamda expression only work with functionalinterface or anonamus class
public class LamdaExpression {

    public static void main(String[] args) {
//        this commented code is anamolus class
//        Printer printer=new Printer() {
//            @Override
//            public void print() {
//                System.out.println("Printer is printing ");
//            }
//        };
//       Printer printer=(String doc) -> System.out.println("Printer is printing " + doc);
        Printer printer=(String doc) -> {System.out.println("Printer is printing " + doc);
        return doc;};
        String output =printer.print("abc.pdf");
        System.out.println(output);
    }

}
