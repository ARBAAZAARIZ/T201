import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class JavaDateAndTime {
    public static void main(String[] args) {
        LocalDateTime todayDateandTime=LocalDateTime.now();
        System.out.println(todayDateandTime);
        ZonedDateTime currentDateTimeWithZone=ZonedDateTime.now();
        System.out.println(currentDateTimeWithZone);
    }
}
