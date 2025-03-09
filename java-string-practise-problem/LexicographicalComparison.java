import java.util.Scanner;

public class StringComparison {

    public static int compareStringsLexicographically(String str1, String str2) {
        // Get the length of both strings
        int len1 = str1.length();
        int len2 = str2.length();
        
        // Compare character by character
        for (int i = 0; i < Math.min(len1, len2); i++) {
            // Compare the characters at the current position
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1; // str1 is lexicographically smaller
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1; // str1 is lexicographically greater
            }
        }
        
        // If the characters are the same up to the length of the shorter string, compare lengths
        if (len1 < len2) {
            return -1; // str1 is lexicographically smaller
        } else if (len1 > len2) {
            return 1; // str1 is lexicographically greater
        }
        
        // Both strings are equal
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        // Compare the strings lexicographically
        int result = compareStringsLexicographically(str1, str2);
        
        // Output the result
        if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater.");
        } else {
            System.out.println("The strings are equal.");
        }
        
        sc.close();
    }
}
