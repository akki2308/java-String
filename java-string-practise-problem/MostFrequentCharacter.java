import java.util.Scanner;

public class MostFrequentCharacter {

    public static char mostFrequentChar(String str) {
        int maxCount = 0;
        char mostFrequentChar = '\0';

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count the occurrences of currentChar in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Update the most frequent character if necessary
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        // Find and print the most frequent character
        char result = mostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + result + "'");
        
        sc.close();
    }
}
