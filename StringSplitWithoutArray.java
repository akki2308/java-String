public class StringSplitWithoutArray {
    public static void main(String[] args) {
        String text = "Hello this is Java";
        String word = "";

        System.out.println("Manual Split:");

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
}
