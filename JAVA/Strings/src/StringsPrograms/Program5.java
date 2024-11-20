package StringsPrograms;

public class Program5 {
    public static void main(String[] args) {
        String data= "a2b2c3";
        char[] c=data.toCharArray();
        int number=1;
        for (int i = 0; i <data.length() ; i++) {
            char ch=c[i];

            if(!Character.isDigit(ch)){
                number=data.charAt(i+1)-'0'; // to convert digit into string
                for(int j=1;j<=number;j++){
                    System.out.print(c[i]);
                }
            }

        }

    }
}
