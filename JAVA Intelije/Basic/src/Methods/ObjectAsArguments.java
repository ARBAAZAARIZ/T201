package Methods;


public class ObjectAsArguments {
    static String name="Arbaaz";
    int age;

    public ObjectAsArguments(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ObjectAsArguments oa=new ObjectAsArguments(21);
        System.out.println(oa.age);
        Demo d=new Demo();
        d.access(oa);


    }
}
class Demo{
    public void access(ObjectAsArguments rv){
        System.out.println(rv.age);
    }
}
