package datetime.exercise02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dtm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        LocalDateTime dh01 = LocalDateTime.now();
        Instant dh02 = Instant.now();

        LocalDateTime dh03 = LocalDateTime.ofInstant(dh02, ZoneId.systemDefault());
        System.out.println(dh01.format(dtm1));
        System.out.println(dh01.format(dtm2));
        System.out.println(dtm3.format(dh02));
        System.out.println(dh02);
        System.out.println(dtm3.format(dh03));
        System.out.println("Day " + dh01.getDayOfMonth());
        System.out.println("Month " + dh01.getMonthValue());
        System.out.println("Year " + dh01.getYear());
        System.out.println("Hour " + dh01.getHour());
        System.out.println("Minute " + dh01.getMinute());
        System.out.println("Second " + dh01.getSecond());
    }
}
