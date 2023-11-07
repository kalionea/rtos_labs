import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате дд.мм.гггг:");

        String userInput = scanner.nextLine();

        // Парсим дату из ввода пользователя
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate userDate = LocalDate.parse(userInput, formatter);
            LocalDate currentDate = LocalDate.now();

            if (userDate.isEqual(currentDate)) {
                System.out.println("Введенная дата совпадает с текущей датой.");
            } else if (userDate.isBefore(currentDate)) {
                System.out.println("Введенная дата раньше текущей даты.");
            } else {
                System.out.println("Введенная дата позже текущей даты.");
            }

        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: введена некорректная дата. Пожалуйста, используйте формат дд.мм.гггг.");
        }
    }
}