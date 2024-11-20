package StringsPrograms;

public class StringBuffers {

    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println("initially capacity sb1 "  + sb1.capacity() );
        sb1.append("Train");
        System.out.println("after appending string sb1  "  + sb1.capacity() );
        System.out.println("new String buffer created sb2");
        StringBuffer sb2=new StringBuffer("Train");
        System.out.println(" here initially string added in string buffer" +
                " constructor and shown capacity  : "+sb2.capacity());
        StringBuffer sb3=new StringBuffer();
        sb3.append("abcdefghijklmnopqrst");
        System.out.println(sb3.capacity());
        sb3.delete(0, sb3.length());
        System.out.println(sb3);
        sb3.setLength(7);
        sb3.append("ArbaazAlam");
        System.out.println(sb3);
        System.out.println(sb3.capacity());

    }



}
