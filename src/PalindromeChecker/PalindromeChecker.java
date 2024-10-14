package PalindromeChecker;

/**
 * Напишите метод, который проверяет, является ли введенная строка
 * палиндромом. Если строка палиндром, возвращайте "Palindrome". Если нет
 * — "Not a palindrome".
 */

public class PalindromeChecker {
    public static String isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversedInput)) {
            return cleanedInput + " - Palindrome";
        } else {
            return cleanedInput+ " - Not a palindrome";
        }
    }

    public static void main(String[] args) {
        String str1 = "Tennet";
        String str2 = "Hello, World";

        System.out.println(isPalindrome(str1)); // Palindrome
        System.out.println(isPalindrome(str2)); // Not a palindrome
    }
}

