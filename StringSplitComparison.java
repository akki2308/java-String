public class StringSplitComparison {
    
    public static void splitTextManually(String text) {
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i); // Build word character by character
            } else {
                System.out.println(word); // Print word when a space is found
                word = ""; // Reset for the next word
            }
        }

        System.out.println(word); // Print the last word
    }

    public static void splitUsingSplitMethod(String text) {
        String[] words = text.split(" "); // Using split() method

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]); // Print each word
        }
    }

    public static void main(String[] args) {
        String text = "Hello this is Java";

        System.out.println("Manual Split:");
        splitTextManually(text); // Call method for manual split

        System.out.println("\nUsing split() method:");
        splitUsingSplitMethod(text); // Call method using built-in split()
    }
}
