package AverageCalculator;

/**
 * Напишите метод, который находит среднее значение массива целых чисел.
 * Если массив пустой или null, метод должен вернуть Double.NaN и вывести
 * сообщение об ошибке
 */
public class AverageCalculator {
    public static double calculateAverage(int[] array) {
        if (array == null) {
            System.out.println("Ошибка: массив null");
            return Double.NaN;
        }
        if (array.length == 0) {
            System.out.println("Ошибка: массив пустой");
            return Double.NaN;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
    public static double findAverage(int[] array) {
        try {
            if (array == null || array.length == 0) {
                System.out.println("Array is empty or null. Cannot compute average.");
                return Double.NaN;
            }
            double sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum / array.length;
        } catch (Exception e) {
// В случае ошибки, выведите сообщение об ошибке
            System.out.println("An error occurred while computing the average.");
            return Double.NaN;
        }
    }

        public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {};
        int[] array3 = null;

        System.out.println("Среднее значение: " + calculateAverage(array1)); // 3.0
        System.out.println("Среднее значение: " + calculateAverage(array2)); // Ошибка: массив пустой или null
        System.out.println("Среднее значение: " + calculateAverage(array3)); // Ошибка: массив пустой или null

        System.out.println("Среднее значение: " + findAverage(array1)); // 3.0
        System.out.println("Среднее значение: " + findAverage(array2)); // Ошибка: массив пустой или null
        System.out.println("Среднее значение: " + findAverage(array3)); // Ошибка: массив пустой или null
    }
}
