import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input strings from user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        int result = 0;

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        // If both strings are equal till minLength, compare lengths
        if (result == 0) {
            result = str1.length() - str2.length();
        }

        // Print the result
        if (result < 0) {
            System.out.println("The first string comes before the second string.");
        } else if (result > 0) {
            System.out.println("The first string comes after the second string.");
        } else {
            System.out.println("Both strings are equal.");
        }

        scanner.close();
    }
}
