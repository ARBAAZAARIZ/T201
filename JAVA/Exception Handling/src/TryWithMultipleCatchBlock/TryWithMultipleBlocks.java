package TryWithMultipleCatchBlock;

public class TryWithMultipleBlocks {

    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e.toString());
        }
//        catch(ArithmeticException e){ --> this will throw error as
//        arithmetic exception is already been by exception class in above
//            System.out.println(e);
//        }

        int arr[]={2,4};
        try{
            
            System.out.println(arr[5]);

        }catch(ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
