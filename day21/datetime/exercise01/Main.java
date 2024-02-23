package datetime.exercise01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        LocalDateTime ldt01 = LocalDateTime.now();
        Instant i01 = Instant.now();
        LocalDate ld01 = LocalDate.parse("2008-03-19");
        LocalDateTime ldt02 = LocalDateTime.parse("2003-07-20T07:36:24");
        Instant i02 = Instant.parse("2012-02-11T12:10:39Z");
        Instant i03 = Instant.parse("2009-10-20T12:10:39-03:00");
        LocalDate ld02 = LocalDate.parse("11/12/2015", dtf01);
        LocalDateTime ld03 = LocalDateTime.parse("11/12/2015 14:21:30", dtf02);

        System.out.println(ldt01);
        System.out.println(i01);
        System.out.println(ld01);
        System.out.println(ldt02);
        System.out.println(i02);
        System.out.println(i03);
        System.out.println(ld02);
        System.out.println(ld03);
    }
}