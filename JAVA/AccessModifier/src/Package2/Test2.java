package Package2;

import Package1.Demo1;

public class Test2 extends Demo1 {
    public static void main(String[] args) {
        Test2 t2=new Test2();
//        System.out.println(t2.im_Private); test2 is a diffrent class so private cannot be accessed in differet class
//        System.out.println(t2.im_default);  test2 is in different package so it
//        cannot protected cannot be accessede from different package
        System.out.println(t2.im_Protected);
        System.out.println(t2.im_Public);
    }
}



