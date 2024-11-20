package Package2;


import Package1.Demo1;

public class Demo2 {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
//        System.out.println(d1.im_Private); cannot be accesed out side the package
//        System.out.println(d1.im_default); default is also cannot be accessed outside the package
//        System.out.println(d1.im_Protected); protected is also
        System.out.println(d1.im_Public);

    }
}
