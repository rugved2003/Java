import java.time.*;

public class ZonedDateTimeExample5 {
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        ZonedDateTime p = zone.minus(Period.ofDays(222));
        System.out.println(p);
    }
}