// Write a JAVA program to capitalize the first letter of each word in an inputted sentence from the keyboard.

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence from the keyboard
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Capitalize the first letter of each word
        String capitalizedSentence = capitalizeWords(inputSentence);

        // Output the result
        System.out.println("Capitalized Sentence: " + capitalizedSentence);

        scanner.close();
    }

    private static String capitalizeWords(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}
