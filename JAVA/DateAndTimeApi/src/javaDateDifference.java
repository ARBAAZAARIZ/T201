import java.time.LocalDate;
import java.time.Period;

public class javaDateDifference {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate after_two_day=today.plusDays(2);
        Period duration1=Period.between(today, after_two_day);
        System.out.println(duration1);


    }
}
