import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        DateTimeFormatter myDateFormate = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate=today.format(myDateFormate);
        System.out.println(formattedDate);
    }
}
