import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
//        Scanner s =new Scanner(System.in);
//        try{
//            System.out.println("Enter your first number");
//           int x= s.nextInt();
//            System.out.println("Enter your second number");
//           int y= s.nextInt();
//            System.out.println(x/y);
//        }catch (ArithmeticException e){
////            System.out.println(e.getMessage());
//            System.out.println("Can't divide any number by zero");
//        }catch(InputMismatchException e){
////            System.out.println(e);
//            System.out.println("please enter valid integer number");
//        }
//        System.out.println("code ended normally");

        System.out.println("statement - 1 ");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(10/2);
        }
        System.out.println("statement - 2");


    }
}
