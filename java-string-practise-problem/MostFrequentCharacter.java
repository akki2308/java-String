import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; // Frequency array
        char mostFrequent = ' ';
        int maxFreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most frequent character: '" + mostFrequent + "' (appears " + maxFreq + " times)");
        sc.close();
    }
}
