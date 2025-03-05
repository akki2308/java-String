import java.util.Scanner;

public class UppercaseConverter {

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Convert text to uppercase using the method
        String upperCaseText = convertToUpperCase(text);

        System.out.println("Uppercase Text: " + upperCaseText);

        scanner.close();
    }
}
