package ArraySubtraction;

import java.util.Arrays;

/**
 * Реализуйте метод subArraysWithExceptionHandling, который принимает
 * два массива целых чисел. Метод должен возвращать новый массив, где
 * каждый элемент является разностью соответствующих элементов двух входных
 * массивов. Если длины массивов не равны, выбрасывайте
 * IllegalArgumentException с сообщением "Массивы разной длины". Если
 * результат разности оказывается отрицательным, выбрасывайте
 * RuntimeException с сообщением "Отрицательный результат разности".
 */

public class ArraySubtraction {
    public static int[] subArraysWithExceptionHandling(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Массивы разной длины");
        }

        int[] resultArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            int difference = array1[i] - array2[i];
            if (difference < 0) {
                throw new RuntimeException("Отрицательный результат разности");
            }
            resultArray[i] = difference;
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 10, 15};
        int[] array2 = {3, 7, 15,1};

        try {
            int[] resultArray = subArraysWithExceptionHandling(array1, array2);
            System.out.println("Результирующий массив: " + Arrays.toString(resultArray));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
