import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string and substring from user
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

        int count = 0;
        int index = mainString.indexOf(subString);

        // Loop through the main string to find occurrences of the substring
        while (index != -1) {
            count++;
            index = mainString.indexOf(subString, index + subString.length());
        }

        System.out.println("The substring \"" + subString + "\" appears " + count + " times in the main string.");
        scanner.close();
    }
}
