package Package1;

public class Demo1 {
    private int im_Private=10;
    int im_default=20;
    protected int im_Protected=30;
    public int im_Public =40;

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        System.out.println(d1.im_Private);
        System.out.println(d1.im_default);
        System.out.println(d1.im_Protected);
        System.out.println(d1.im_Public);


    }
}
class Testy {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
//        System.out.println(d1.im_Private); thows erroe cause private is only
//        accessible with in class where it is defined

        System.out.println(d1.im_default);
        System.out.println(d1.im_Protected);
        System.out.println(d1.im_Public);
    }
}
