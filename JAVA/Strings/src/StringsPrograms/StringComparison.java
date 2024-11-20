package StringsPrograms;

public class StringComparison {

    public static void main(String[] args) {
        String s1=new String("Arbaaz");
        String s2=new String("Arbaaz");

//        comparing string with refrence comparison
        System.out.println(s1==s2);// it will return false
        String s3="Arbaaz";
        String s4="Arbaaz";

        String s5=s2;
        System.out.println(s5==s2);

        System.out.println(s3==s4);


    }
}
