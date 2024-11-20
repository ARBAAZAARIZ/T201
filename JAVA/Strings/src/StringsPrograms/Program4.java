package StringsPrograms;

public class Program4 {
    public static void main(String[] args) {
        String name="In23dia";
        int num=1;

        char [] names=name.toCharArray();

        for(char c : names){
         if(Character.isDigit(c)){
             num=c-'0';
             System.out.println(num);
         }
        }
    }
}
