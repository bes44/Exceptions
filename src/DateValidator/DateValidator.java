package DateValidator;

/**
 * Напишите метод, который проверяет, является ли введенная строка корректной
 * датой в формате "YYYY-MM-DD". Дата должна быть в пределах от 0001-01-01
 * до 9999-12-31. Если дата корректна, возвращайте её. Если нет — сообщение
 * об ошибке.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
    public static String validateDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate date = LocalDate.parse(dateString, formatter);
            if (date.getYear() < 1 || date.getYear() > 9999) {
                return "Ошибка: дата выходит за допустимые пределы.";
            }
            return "Дата корректна: " + dateString;
        } catch (DateTimeParseException e) {
            return "Ошибка: некорректный формат даты.";
        }
    }

    public static void main(String[] args) {
        String date1 = "2024-10-14";
        String date2 = "0000-01-01";
        String date3 = "abcd-ef-gh";

        System.out.println(validateDate(date1)); // Дата корректна: 2024-10-14
        System.out.println(validateDate(date2)); // Ошибка: дата выходит за допустимые пределы.
        System.out.println(validateDate(date3)); // Ошибка: некорректный формат даты.
    }
}
