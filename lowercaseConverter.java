import java.util.Scanner;

public class LowercaseConverter {

    // Method to convert text to lowercase
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Convert text to lowercase using the method
        String lowerCaseText = toLowerCase(text);

        System.out.println("Lowercase Text: " + lowerCaseText);

        scanner.close();
    }
}
