import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class JavaInstant {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Instant at_this_moment= Instant.now();
        System.out.println(at_this_moment);

        ZonedDateTime in_america=at_this_moment.atZone(ZoneId.of("America/New_York"));
        System.out.println(in_america);

        Instant start=Instant.now();
        System.out.println(start);
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        Instant end=Instant.now();
        System.out.println(end);
        Duration time_distance=Duration.between(start,end);
        System.out.println(time_distance);

    }

}
