import java.util.Scanner;

public class AnagramChecker {
    // Method to check if two texts are anagrams
    static boolean isAnagram(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }
        
        // Create frequency arrays for characters (assuming ASCII)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        
        // Populate frequency arrays
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }
        
        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase(); // Remove spaces and convert to lowercase
        
        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase(); // Remove spaces and convert to lowercase
        
        // Check if texts are anagrams
        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        
        scanner.close();
    }
}
