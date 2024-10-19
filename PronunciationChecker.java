import java.util.Scanner;

public class PronunciationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Loop through each test case
        for (int t = 0; t < T; t++) {
            // Read the length of the string (not actually used in the logic)
            int N = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Read the string S
            String S = scanner.nextLine();

            // Check if the word is easy to pronounce
            if (isEasyToPronounce(S)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    // Function to check if the word is easy to pronounce
    public static boolean isEasyToPronounce(String S) {
        // Vowels
        String vowels = "aeiou";
        
        // Counter for consecutive consonants
        int consonantCount = 0;

        // Loop through each character in the string
        for (char c : S.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(c) >= 0) {
                // Reset the consonant counter if a vowel is found
                consonantCount = 0;
            } else {
                // Increment the consonant counter if a consonant is found
                consonantCount++;
                // If there are 4 or more consecutive consonants, it's hard to pronounce
                if (consonantCount >= 4) {
                    return false;
                }
            }
        }

        // If we never found 4 or more consecutive consonants, it's easy to pronounce
        return true;
    }
}