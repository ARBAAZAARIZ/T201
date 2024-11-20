package GuessNumber;
import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sp = "1234";
        String ep = "";

        while (!ep.equals(sp)) {
            String input = s.next();
            ep = input;
            if (ep.equals(sp)) {
                System.out.println("Welcome");
                break;
            }
        }
        System.out.println(ep instanceof String);
}
}