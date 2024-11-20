package ThrowsProgram_Package;

public class Case1 {
    void sleeping() throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("I sleeped happly");
    }
    public static void main(String[] args) {
        Case1 case1=new Case1();
        try {
            case1.sleeping();
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
