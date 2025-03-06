import java.util.Scanner;

public class UniqueCharactersFinder {
    
    // Method to find the length of the string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access character at count index
                count++; // Increment count
            }
        } catch (Exception e) {
            return count; // Return count when exception occurs
        }
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);
        char[] uniqueChars = new char[len]; // Array to store unique characters
        int uniqueCount = 0; // Counter for unique characters

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character already exists in uniqueChars
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, store it in the array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array of exact size to store unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        scanner.close();

        char[] uniqueCharacters = findUniqueCharacters(inputText);

        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }
}


/*
Input:
Enter a string: programming

Output:
Unique characters: p r o g a m i n 
*/