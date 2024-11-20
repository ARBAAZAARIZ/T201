package UserDefinedEXception;

import java.util.Scanner;

public class Matrimorial {

    public static void checkage(int age) throws TooYoungException, TooOldeException{
        if(age>60){
            throw new TooOldeException(" : Your age crossed marriage age");
        }
        else if (age<18){
            throw new TooYoungException(" : You  are too young for marriage , first get 18+ then you can " +
                    "register here ");
        }

        else{
            System.out.println("Thanks For registration, You will get information by email");
        }
    }
    public static void main(String[] args) {
//        int age=Integer.parseInt(args[0]);
        int age ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age");
        age=s.nextInt();
        try {
            checkage(age);
        }catch (TooYoungException | TooOldeException e){
            System.out.println(e);
        }
    }
}
