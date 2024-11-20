package FinallyBlock;

public class CaseWhereFinallyBlockDosntExecute {
    // raising exception in finally block as we know
    // that excepition raised in finally block will not execute finally block
    void printing_array(int [] a){
        try{
            for (int i = 0; i <=a.length ; i++) {
                System.out.println(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println(a[a.length]);
        }
    }
//    using System.exit(0) method to terminate the jvm
    void division(int x, int y){
        try{
            System.out.println(x/y);
            System.exit(0);
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }

        finally {
            System.out.println("Entered finally block");
        }

    }

    public static void main(String[] args) {
        int arr[]={34,56,3,8};
        CaseWhereFinallyBlockDosntExecute caseWhereFinallyBlockDosntExecute=new CaseWhereFinallyBlockDosntExecute();
//        caseWhereFinallyBlockDosntExecute.printing_array(arr);
        caseWhereFinallyBlockDosntExecute.division(10, 0);  

    }
}
