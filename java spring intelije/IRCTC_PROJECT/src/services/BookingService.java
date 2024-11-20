package services;

import Model.Routes;
import Model.Train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookingService extends UserServices {
        Map<Integer, Train> trains=new HashMap<>();

    Scanner sc = new Scanner(System.in);

        public void preDefinedTrains(){
            trains.put(12101, new Train(12101,
                    "JANANESWARI EXP",             //train 1 down
                    Routes.lokmanyatilak,Routes.kolkata,
                    72));

            trains.put(12102, new Train(12102,
                    "JANANESWARI EXP",              // train 1 up
                    Routes.kolkata,Routes.lokmanyatilak,
                    72));

//            -----------------------------------------------

            trains.put(12860, new Train(12860,
                    "GITANJALI EXP",                // train 2 down
                    Routes.chhatrapati_Shivaji_Terminus,Routes.kolkata,
                    72));

            trains.put(12859, new Train(12859,
                    "GITANJALI EXP",              // train 2 up
                    Routes.kolkata,Routes.chhatrapati_Shivaji_Terminus,
                    72));

//            -------------------------------------------------

            trains.put(22692, new Train(22692,
                    "SBC RAJDHANI",              // train 3 up
                    Routes.delhi,Routes.bangalore,
                    60));

            trains.put(22691, new Train(22691,
                    "SBC RAJDHANI",          // train 3 down
                    Routes.bangalore,Routes.delhi,
                    60));

//            ---------------------------------------------

            trains.put(12870, new Train(12870,
                    "HWH CSMT SF EXP",          // train 4 down
                    Routes.chhatrapati_Shivaji_Terminus,Routes.rourkela,
                    48));

            trains.put(12871, new Train(12871,
                    "CSMT HWH SF EXP",          // train 4 down
                    Routes.rourkela,Routes.chhatrapati_Shivaji_Terminus,
                    48));

//            -------------------------------------------------

            trains.put(20840, new Train(20840,
                    "VANDE BHARAT",          // train 5 down
                    Routes.delhi,Routes.ranchi,
                    60));

            trains.put(20841, new Train(20841,
                    "VANDA BHARAT",          // train 5 down
                    Routes.ranchi,Routes.delhi,
                    60));
        }

        public void getAllTrains(){
            for(Map.Entry<Integer,Train> trainMap:trains.entrySet()){
                System.out.println(trainMap.getValue());
            }
        }

    public int mainMenu() {
        System.out.println("🎉 Welcome to the Main Menu! Get ready to dive into an awesome adventure! 🚀");
        System.out.println("1. View Trains");
        System.out.println("2. Book Ticket");
        System.out.println("3. Cancel Ticket");
        System.out.println("4. View Booked Tickets");
        System.out.println("5. Exit");

        int choice = sc.nextInt();
        return choice;
    }







}
