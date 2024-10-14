package StringArraySorter;

import java.util.Arrays;

/**
 * Напишите метод, который принимает массив строк и сортирует его в
 * алфавитном порядке. Если входной массив null, метод должен вернуть пустой
 * массив и вывести сообщение об ошибке.
 */

public class StringArraySorter {
    public static String[] sortStringArray(String[] array) {

        if (array == null) {
            System.out.println("Ошибка: входной массив null");
            return null;
        }

        Arrays.sort(array);
        System.out.println("Отсортированный массив: ");
        return  array;
    }
    public static String[] sortStringArray2(String[] array) {
        try {
            if (array == null) {
                System.out.println("Input array is null. Returning an empty array.");
            }
        }
            catch(Exception e){
// В случае ошибки сортировки, выведите сообщение об ошибке
                System.out.println("An error occurred during sorting.");
                return null;
            }
            Arrays.sort(array);
            System.out.println("Отсортированный массив: ");
            return array;

    }
    public static void main(String[] args) {
        String[] array1 = {"banana", "apple", "cherry"};
        String[] array2 = null;

        System.out.println(Arrays.toString(sortStringArray(array1)));
        System.out.println(Arrays.toString(sortStringArray(array2))); // Ошибка: входной массив null

        System.out.println(Arrays.toString(sortStringArray2(array1)));
        System.out.println(Arrays.toString(sortStringArray2(array2))); // Ошибка: входной массив null

    }
}
