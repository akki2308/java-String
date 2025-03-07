import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        // Input word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();

        // Input new word
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();

        // Replace the word
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        
        // Output the result
        System.out.println("Updated sentence: " + updatedSentence);
        
        scanner.close();
    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }
}
