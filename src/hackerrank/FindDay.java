package hackerrank;

import java.time.LocalDateTime;

public class FindDay {
    public static String findDay(int month, int day, int year) {
        return LocalDateTime.of(year, month, day,0,0).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        findDay(Integer.parseInt("08"), Integer.parseInt("05"), Integer.parseInt("2015"));
    }
}
