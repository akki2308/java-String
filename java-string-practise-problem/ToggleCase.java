import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder toggledString = new StringBuilder();

        // Toggle case for each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledString.append(Character.toUpperCase(ch));
            } else {
                toggledString.append(ch); // Keep non-alphabet characters unchanged
            }
        }

        // Print the result
        System.out.println("Toggled string: " + toggledString);
        scanner.close();
    }
}
