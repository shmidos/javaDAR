package HW10;
public class Weekday {

    private static boolean isWeekDay(String day) {
        return !day.equals("SATURDAY") && !day.equals("SUNDAY");
    }
    private static boolean isHoliday(String day) {
        return !isWeekDay(day);
    }
    private static void printDayType(String day) {
        if (isHoliday(day)) {
            System.out.println(day + " is a holiday!");
        } else {
            System.out.println(day + " is a weekday.");
        }
    }
    public static void main(String[] args) {
        // Пример использования
        String[] weekdays = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        for (String day : weekdays) {
            printDayType(day);
        }
    }
}
