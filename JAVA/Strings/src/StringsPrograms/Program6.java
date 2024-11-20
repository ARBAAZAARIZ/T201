package StringsPrograms;

public class Program6 {



    public static void main(String[] args) {
        String name="mom";
        boolean istrue=false;

        char[] c=name.toCharArray();
        int l=c.length;
        for (int i = 0; i <=c.length/2 ; i++) {
            if (c[i] == c[l - 1 - i]) {
                istrue = true;

            }
        }
        if(istrue){
            System.out.println("It is palindrome string");
        }
        else{
            System.out.println("not a palindrome string");
        }
    }

}
