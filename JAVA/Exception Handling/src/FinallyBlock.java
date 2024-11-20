import java.util.Scanner;
public class FinallyBlock
{
//    finally block - executes weather exception raised or not , or the exception is handled or not ,
//    it is used to write resource deallocation code
//    finally onlyget executed if control goed=s in side the try block

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        try {
            System.out.println("Enter your number");
            int x=s.nextInt();
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println("cant divide any number by 0");
        }
        finally {
            System.out.println("I am finally block code");
        }
        System.out.println("program ended normally");

    }
}
