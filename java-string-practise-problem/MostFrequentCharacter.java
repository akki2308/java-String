import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] freq = new int[256]; // Array to store frequency of characters (ASCII range)

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the character with the highest frequency
        char mostFrequent = str.charAt(0);
        int maxFreq = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxFreq) {
                maxFreq = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        System.out.println("Most frequent character: '" + mostFrequent + "' (appears " + maxFreq + " times)");
        scanner.close();
    }
}
