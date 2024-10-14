package NumberConverter;

/**
 * Реализуйте метод convertAndSum, который принимает массив строк, каждая
 * из которых должна быть преобразована в целое число. Метод возвращает
 * сумму всех чисел. Если хотя бы одна строка не может быть преобразована в
 * число, метод должен выбросить исключение NumberFormatException.
 * Дополнительно, если сумма чисел превышает 100, выбрасывайте
 * ArithmeticException с сообщением "Превышен лимит суммы".
 */


public class NumberConverter {
    public static int convertAndSum(String[] numbers) throws NumberFormatException, ArithmeticException {
        int sum = 0;

        for (String numberStr : numbers) {
            try {
                int number = Integer.parseInt(numberStr);
                sum += number;
                if (sum > 100) {
                    throw new ArithmeticException("Превышен лимит суммы");
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Не удается преобразовать строку в число: " + numberStr);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "65"};

        try {
            int result = convertAndSum(numberStrings);
            System.out.println("Сумма: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
        String[] numberStrings2 = {"20", "20", "70"};
        try {
            int result = convertAndSum(numberStrings2);
            System.out.println("Сумма: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
