public class ThrowsAndThrow {
    void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        ThrowsAndThrow tt=new ThrowsAndThrow();
        try{
            tt.div(10, 0);
        }catch (ArithmeticException e){
            System.out.println("can't divide any number by zero");
        }
    }
}
