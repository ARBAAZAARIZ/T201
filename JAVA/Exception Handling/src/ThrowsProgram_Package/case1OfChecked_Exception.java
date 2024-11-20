package ThrowsProgram_Package;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class case1OfChecked_Exception {
    public static void main(String[] args) {
//        try {
//            PrintWriter printWriter = new PrintWriter("abs.txt");
//            printWriter.println("Hello");
//        }catch(FileNotFoundException e){
//            System.out.println(e);
//        }
        LocalTime instanceTime=LocalTime.now();
        System.out.println(instanceTime);

        try{
        Thread.sleep(4000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        instanceTime=LocalTime.now();
        System.out.println(instanceTime);
        System.out.println("hello");

    }
}
