package StringsPrograms;

public class program1 {

    public static void main(String[] args) {
        String name="rutuja";
        int count=0;

        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i) == 'u') {
                count ++;
            }
        }
        System.out.println(name + " has " + count + " u");


    }

}
