public class StringSplitWithLength {

    public static String[][] splitTextWithLength(String text) {
        String[] words = text.split(" "); // Split the text into words
        String[][] result = new String[words.length][2]; // 2D array for word and its length

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(words[i].length()); // Store word length as string
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "Hello this is Java";

        String[][] wordsWithLengths = splitTextWithLength(text);

        System.out.println("Words and their lengths:");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + " - " + wordsWithLengths[i][1]);
        }
    }
}
