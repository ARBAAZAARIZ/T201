package StringsPrograms;

public class program3 {
    public static void main(String[] args) {
        String name="ArbAAzq&";
            int upperCount=0;
            int lowerCount=0;
            int specialcount=0;
        for(int i=0 ;i<name.length();i++){
            char ch = name.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCount++;
            }
            else{
                specialcount++;
            }
        }
        System.out.println("upper case are : " + upperCount);
        System.out.println("lower case are : " + lowerCount);
        System.out.println("Special char are : " + specialcount);
    }
}
