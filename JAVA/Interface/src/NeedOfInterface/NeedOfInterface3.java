package NeedOfInterface;

interface Computer3{
    abstract void code();
}
class Laptop3 implements Computer3{
    public void code(){
        System.out.println("Coding using laptop");
    }
}

class Desktop3 implements Computer3{
    public void code(){
        System.out.println("Coding using desktop");
    }
}
class Developer3 implements Computer3 {
    public void doWork(Computer3 computer3){
        computer3.code();
    }

    @Override
    public void code() {

    }
}
public class NeedOfInterface3 {
}
