package Package1;

public class Test1 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
//        System.out.println(d1.im_Private); thows erroe cause private is only
//        accessible with in class where it is defined

        System.out.println(d1.im_default);
        System.out.println(d1.im_Protected);
        System.out.println(d1.im_Public);
    }
}
