package Static_Modifier;
// static block executes first before main method
// we can only access static variable and method inside static block (not non static)
public class StaticBlock {
    static int x=10;
    static{
        System.out.println("I am a static method");
        x=x+20;
    }

    public static void main(String[] args) {
        System.out.println("I am main method");
        System.out.println(StaticBlock.x);
    }
}
