public class StringLengthWithoutMethod {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = findStringLength(str);
        System.out.println("Length of the string: " + length);
    }

    public static int findStringLength(String str) {
        int count = 0;
        
        for (int i = 0; ; i++) { // Infinite loop
            try {
                str.charAt(i); // Try accessing character at index i
                count++;
            } catch (IndexOutOfBoundsException e) {
                break; // Exit loop when index is out of bounds
            }
        }
        
        return count;
    }
}
