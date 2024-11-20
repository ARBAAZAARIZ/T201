public class MethodsToPrintEXCInfo {
        void method1(){
            try{
                System.out.println(10/0);
            }catch(ArithmeticException e){
            System.out.println("by e.printStackTrace method");
               e.printStackTrace();
            }
        }
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
//            System.out.println("by e.printStackTrace method");
//               e.printStackTrace();
            System.out.println("exception raised in main method");
            System.out.println("by .toString method");
            System.out.println(e.toString());
//
//            System.out.println("by .getMessage");
//            System.out.println(e.getMessage());
        }
        MethodsToPrintEXCInfo mtp=new MethodsToPrintEXCInfo();
        mtp.method1();

    }

}
