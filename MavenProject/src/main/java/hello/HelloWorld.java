package hello;
import org.joda.time.LocalTime;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Localtime currTime=LocalTime.now();
        System.out.println(currTime);
    }
}