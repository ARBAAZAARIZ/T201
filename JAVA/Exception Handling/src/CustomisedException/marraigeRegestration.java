package CustomisedException;

import java.util.Scanner;

public class marraigeRegestration {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("please enter your age ");
        int age=s.nextInt();
        if(age>60){
            throw new TooOldException("Please Your age already crossed marraige, " +
                    "please wait you will find peace ");
        } else if (age<17) {
            throw new TooYoungException("Yor not elligable for marraige please cross 18+");
        }else{
            System.out.println("Scessfully registered . By mail you will get the useNname ");
        }
    }
}
