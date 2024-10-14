package StringReplacer;
/**
 * Реализуйте метод findAndReplace, который принимает массив строк, строку
 * для поиска и строку для замены. Если искомая строка не найдена, добавьте
 * сообщение об ошибке в список. Верните новый массив строк с выполненной
 * заменой.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReplacer {
    public static String[] findAndReplace(String[] array, String searchString, String replaceString) {
        List<String> result = new ArrayList<>();
        boolean found = false;

        for (String item : array) {
            if (item.equals(searchString)) {
                result.add(replaceString);
                found = true;
            } else {
                result.add(item);
            }
        }

        if (!found) {
            result.add("Ошибка: строка '" + searchString + "' не найдена");
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};
        String searchString = "banana";
        String replaceString = "orange";

        String[] result = findAndReplace(array, searchString, replaceString);
        System.out.println("Результат: " + Arrays.toString(result));

        String searchString2 = "banana2";
        String replaceString2 = "orange";
        String[] result2 = findAndReplace(array, searchString2, replaceString2);
        System.out.println("Результат: " + Arrays.toString(result2));
    }
}
