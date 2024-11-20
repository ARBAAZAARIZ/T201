package GuessNumber;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random rand=new Random();
        int ci= rand.nextInt(1,100);
        System.out.println("enter your guessed number");
        int ui=s.nextInt();
        System.out.println("you got 10 guesses");
        int counter=0;

        while(counter<=10){
            if(ui==ci){
                System.out.println("You guessed it right ");
                System.out.println("You have taken " + counter +" to guess the number");
                break;
            }
            if(ui>ci){
                System.out.println("Wrong answer ! provide smaller number");
                counter++;
            }
            else if(ui<ci){
                System.out.println("Wrong answer ! provide larger number ");
                counter++;

            }
            ui=s.nextInt();

        }

    }
}
