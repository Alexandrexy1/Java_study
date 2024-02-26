package date;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat simpdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        simpdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date randomDay1 = simpdf1.parse("26/02/2024");
        Date randomDay2 = simpdf2.parse("26/02/2024 12:06:30");
        Date randomDate1 = Date.from(Instant.parse("2024-02-26T12:20:01Z"));
        Date randomDate2 = Date.from(Instant.parse("2024-02-26T12:20:01Z"));

        Instant safeDate = Instant.parse("2003-07-20T07:34:22Z");
        LocalDateTime safeDateTime = LocalDateTime.ofInstant(safeDate, ZoneId.of("UTC"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Date todayDate = new Date();
        Date firstTime = new Date(1000L * 60L * 60L * 5L);

        System.out.println(simpdf2.format(randomDay1));
        System.out.println(simpdf2.format(randomDay2));
        System.out.println(simpdf2.format(todayDate));
        System.out.println(simpdf2.format(firstTime));
        System.out.println(simpdf2.format(randomDate1));
        System.out.println(simpdf3.format(randomDate2));
        System.out.println(dtf.format(safeDateTime));
        


    }
}