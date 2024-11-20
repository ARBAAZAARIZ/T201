import services.BookingService;
import services.UserServices;

import java.util.Scanner;

public class Irctc_FrontEnd {

    static UserServices userServices=new UserServices();
    static BookingService bookingService=new BookingService();
    static {
        System.out.println();
        System.out.println("Welcome to the IRCTC Ticket" +
                " Management System! \uD83C\uDFAB Ready to streamline your travel plans.");
        bookingService.definedUser();

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1. Register");
        System.out.println("2. Already user? Sign in");
        System.out.println("3. Exit");

        boolean isAuthenticated=true;
        int choice = s.nextInt();

        if(choice==1){
            isAuthenticated= bookingService.registerUser();
        } else if (choice==2) {
            try {
                isAuthenticated=  bookingService.login();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        int option=-1;

        if(isAuthenticated){
           option= bookingService.mainMenu();
        }

       if(option==1){
           bookingService.getAllTrains();
       }

    }
}
