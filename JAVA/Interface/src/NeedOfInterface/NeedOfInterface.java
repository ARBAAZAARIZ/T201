package NeedOfInterface;
class Computer{
    void code(){
        System.out.println("Coding using computer");
    }
}

class Laptop1 extends Computer{
    void code(){
        System.out.println("Coding using laptop");
    }
}
class Desktop1 extends Computer{
    void code(){
        System.out.println("Coding using desktop");
    }
}

class Developer1{
    public void doWork(Computer computer){
        computer.code();
    }
}
public class NeedOfInterface {
    public static void main(String[] args) {
            Computer laptop =new Laptop1();
            Computer desktop= new Desktop1();

            Developer1 arbaaz =new Developer1();
            arbaaz.doWork(laptop);
            arbaaz.doWork(desktop);
    }
}
