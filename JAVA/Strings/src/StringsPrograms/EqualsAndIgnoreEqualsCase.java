package StringsPrograms;
import java.util.Scanner;
public class EqualsAndIgnoreEqualsCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your city name");
        String city=s.nextLine().trim(); //.toLowerCase(); we can use toLowercase to convert
//       user input string into lower case as there is lower case to compare

        if(city.equalsIgnoreCase("mumbai")){
            System.out.println("welcome to mumbai");
        }else if (city.equalsIgnoreCase("rourkela")){
            System.out.println("welcome to rourkela");
        } else if (city.equalsIgnoreCase("kolkata")) {
            System.out.println("welcome to kolkata");
        }else{
            System.out.println("please enter a valid number");
        }


    }
}
