package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }
        if (month == 2) {
            System.out.println(year % 4 == 0 && year != 1900 ? 29 : 28);
            return;
        }
        switch (month) {
            case 1, 3, 5, 8, 10, 12 -> System.out.println(31);
            case 4, 6, 7, 9, 11 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }
    }
}
