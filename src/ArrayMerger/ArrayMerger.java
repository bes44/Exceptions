package ArrayMerger;

import java.util.Arrays;

/**
 * Реализуйте метод mergeAndValidateArrays, который принимает два
 * массива целых чисел. Метод должен объединить массивы и вернуть новый
 * массив. Если длины массивов не равны, выбрасывайте исключение
 * IllegalArgumentException. Если хотя бы один элемент объединенного
 * массива отрицательный, выбрасывайте исключение RuntimeException с
 * сообщением "Обнаружен отрицательный элемент".
 */
public class ArrayMerger
    {
        public static int[] mergeAndValidateArrays (int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Длины массивов не равны");
        }

        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;

        for (int value : array1) {
            if (value < 0)  throw new RuntimeException("Обнаружен отрицательный элемент");
            mergedArray[index++] = value;
        }

        for (int value : array2) {
            if (value < 0)  throw new RuntimeException("Обнаружен отрицательный элемент");
            mergedArray[index++] = value;
        }
        return mergedArray;
    }

    public static void main (String[]args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, -6};

        try {
            int[] mergedArray = mergeAndValidateArrays(array1, array2);
            System.out.println("Объединенный массив: " + Arrays.toString(mergedArray));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }

    }
}