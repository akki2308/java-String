import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Input the character to remove
        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);

        // String to store result
        String result = "";

        // Iterate through the string and remove the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }

        // Output the modified string
        System.out.println("String after removing '" + ch + "': " + result);
        
        scanner.close();
    }
}
