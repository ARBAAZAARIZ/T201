package FinallyBlock;

public class finallyBlock1 {

    public static void main(String[] args) {
//        when Exception raised
        System.out.println("When Exception raised and handled by catch block");
        try{
            System.out.println("entered try block");
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("entered catch block");
            System.out.println(e.toString());
        }
        finally {
            System.out.println("finally block executed ");
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("exception raised and not handled by catch block ");
        int arr[]=new int[2];
        try{
            arr[3]=10;
        }catch (ArithmeticException  e){
            System.out.println(e);
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("Rest of the code");

    }

}
