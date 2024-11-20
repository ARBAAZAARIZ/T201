package NeedOfInterface;
abstract class Computer2{
    abstract  void code();
}
class Laptop2 extends Computer2{
    @Override
     void code() {
        System.out.println("coding using laptop");
    }
}
class Desktop2 extends Computer2{
    @Override
    void code() {
        System.out.println("code using desktop");
    }
}
class Develper2 {
    public void doWork(Computer2 computer2){
        computer2.code();
    }
}
public class NeedofInterface2 {
    public static void main(String[] args) {

    }

}
