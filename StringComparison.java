import java.util.Scanner;

public class StringComparison {
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, strings are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character differs, strings are not equal
            }
        }
        return true; // If all characters match, strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        // Comparing using charAt() method
        boolean charAtComparison = compareUsingCharAt(str1, str2);
        // Comparing using built-in equals() method
        boolean equalsMethodComparison = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsMethodComparison);

        // Checking if both methods return the same result
        if (charAtComparison == equalsMethodComparison) {
            System.out.println("Both methods return the same result.");
        } else {
            System.out.println("Methods return different results.");
        }

        scanner.close();
    }
}
