import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i)); // Append characters one by one
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the main string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Creating substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(text, start, end);
        // Creating substring using built-in substring() method
        String substringUsingBuiltIn = text.substring(start, end);

        // Comparing the two substrings
        boolean areEqual = compareUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
