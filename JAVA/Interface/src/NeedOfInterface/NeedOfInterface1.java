package NeedOfInterface;

class Developer{
    public void doWork(Laptop laptop){
        Laptop.code();

    }
}

class Laptop{
    static void code(){
        System.out.println("coding using laptop");
    }
}
class Desktop{
    static void code(){
        System.out.println("coding using computer");
    }
}

public class NeedOfInterface1 {
    public static void main(String[] args) {

        Laptop laptop=new Laptop();
        Desktop desktop=new Desktop();

        Developer arbaaz=new Developer();
        arbaaz.doWork(laptop);
        Developer aariz =new Developer();
//        aariz.doWork(desktop); --> throws error as as we r passing
//        desktop object but required laptop object
    }



}
