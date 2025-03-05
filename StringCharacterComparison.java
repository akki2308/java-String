import java.util.Scanner;
import java.util.Arrays;

public class StringCharacterComparison {
    
    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i); // Extract each character
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2); // Returns true if both arrays are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Getting characters using user-defined method
        char[] customCharArray = getCharacters(text);
        
        // Getting characters using built-in toCharArray() method
        char[] builtInCharArray = text.toCharArray();
        
        // Comparing both arrays
        boolean isEqual = compareArrays(customCharArray, builtInCharArray);
        
        // Displaying the result
        System.out.println("Characters using user-defined method: " + Arrays.toString(customCharArray));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtInCharArray));
        System.out.println("Are both arrays equal? " + isEqual);
        
        scanner.close();
    }
}
