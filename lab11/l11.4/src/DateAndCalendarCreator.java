import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос данных у пользователя
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt() - 1; // В Java месяцы начинаются с 0

        System.out.println("Введите число:");
        int day = scanner.nextInt();

        System.out.println("Введите часы:");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты:");
        int minutes = scanner.nextInt();

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        // Создание объекта Date
        Date date = calendar.getTime();

        // Вывод результатов
        System.out.println("Созданная дата (Date объект): " + date);
        System.out.println("Созданный календарь (Calendar объект): " + calendar.getTime());
    }
}