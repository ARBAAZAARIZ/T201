import java.time.LocalDate;
public class JavaDate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("today date: "+today);
        LocalDate customeDate=LocalDate.of(2024, 9, 23);
        System.out.println("custome date: "+customeDate);

        System.out.println("year: "+today.getYear());
        System.out.println("Month: "+today.getMonth());
        System.out.println("Month value: "+today.getMonthValue());
        System.out.println("Day: "+today.getDayOfMonth());
        System.out.println("class of today date: "+today.getClass());
        System.out.println(today.isLeapYear());

        LocalDate afterTwo=today.plusDays(2);
        System.out.println("after two day  from today date: "+afterTwo);
        LocalDate afterTwoMonth=today.plusMonths(2);
        LocalDate afterTwoYear=today.plusYears(2);
        System.out.println("after two Month  from today date: "+afterTwoMonth);
        System.out.println("after two year  from today date: "+afterTwoYear);

        LocalDate beforeTwoDay=today.minusDays(2);
        System.out.println("before two days from today: " + beforeTwoDay);
        LocalDate beforeTwoMonth=today.minusMonths(2);
        LocalDate beforeTwoYear=today.minusYears(2);
        System.out.println("before two Month from today: " + beforeTwoMonth);
        System.out.println("before two Year from today: " + beforeTwoYear);

        LocalDate parseDate=LocalDate.parse("2024-09-24");
        System.out.println(parseDate);
        System.out.println(parseDate.getMonth());





    }
}
