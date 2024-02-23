package datetime.exercise03;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2023-09-20T20:03:30");
        Instant d03 = Instant.now();
        LocalDate pastWeekd01 = d01.minusWeeks(1);
        LocalDate nextWeekd01 = d01.plusWeeks(1);
        LocalDateTime pastMonthd02 = d02.minusMonths(1);
        LocalDateTime nextMonthd02 = d02.plusMonths(1);
        System.out.println(pastWeekd01);
        System.out.println(nextWeekd01);
        System.out.println(pastMonthd02);
        System.out.println(nextMonthd02);
        System.out.println(d03);

        Instant twoDaysAgoInst = d03.minus(2, ChronoUnit.DAYS);
        System.out.println(twoDaysAgoInst);

        Duration duration01 = Duration.between(pastWeekd01.atStartOfDay(), d01.atStartOfDay());
        Duration duration02 = Duration.between(pastMonthd02, nextMonthd02);
        System.out.println(duration01.toDays());
        System.out.println(duration02.toDays());
    }
}
