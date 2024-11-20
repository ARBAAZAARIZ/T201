package Inheritance;

class parentx{
    int paisa=500;
    void marraige(){
        System.out.println("You have to marry hema");
    }
}
class childx extends parentx{
    void marraige(){
        System.out.println("I want to marry rekha");
        super.marraige();
    }
}
public class Method_OverRiding {
    public static void main(String[] args) {
        childx c1=new childx();
        System.out.println(c1.paisa);
        c1.marraige();
    }
}
