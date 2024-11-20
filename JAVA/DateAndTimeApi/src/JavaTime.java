import java.time.LocalTime;
public class JavaTime {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        System.out.println("current time: " + currentTime);

        LocalTime customeTime=LocalTime.of(13, 25,46);
        System.out.println("our customed time: "+ customeTime);

        System.out.println("current hour: " + currentTime.getHour());
        System.out.println("current minutes: "+currentTime.getMinute());
        System.out.println("current second: "+currentTime.getSecond());

        LocalTime afterTwoHour=currentTime.plusHours(2);
        System.out.println("after two hour: "+afterTwoHour);
        LocalTime after24Minutes=currentTime.plusHours(24);
        LocalTime after60Second=currentTime.plusHours(60);
        System.out.println("after 24 minutes: " + currentTime);
        System.out.println("after 60 sec: " + after60Second);

        LocalTime parsetime=LocalTime.parse("12:34");
        System.out.println("Our time: "+parsetime);
        System.out.println("minut from our time: "+parsetime.getMinute());


    }
}
