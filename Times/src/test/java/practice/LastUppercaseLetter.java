package practice;

public class LastUppercaseLetter {

    public static void main(String[] args) {
        // Test cases
        String input1 = "aAbBcC";
        String input2 = "aAbBcCdDxX";
        String input3 = "aAbBcCzZxX";

        // Output the result for each input
        System.out.println("Output 1: " + findLastUppercaseLetter(input1));
        System.out.println("Output 2: " + findLastUppercaseLetter(input2));
        System.out.println("Output 3: " + findLastUppercaseLetter(input3));
    }

    private static char findLastUppercaseLetter(String input) {
        // Iterate over the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);

            // Check if the character is an uppercase letter
            if (Character.isUpperCase(currentChar)) {
                return currentChar; // Return the first uppercase letter found
            }
        }

        return ' '; // Return a default value if no uppercase letter is found
    }
}
