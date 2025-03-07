import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        // Convert both strings to lowercase for case-insensitive comparison
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Check if both strings have the same length
        if (s1.length() == s2.length()) {

            // Convert strings to char arrays and sort them
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            // Check if sorted arrays are equal
            if (Arrays.equals(a1, a2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        } else {
            System.out.println("The strings are not anagrams (length mismatch).");
        }

        scanner.close();
    }
}
