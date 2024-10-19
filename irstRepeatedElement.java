import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        int[] input = {1, 2, 4, 1, 2, 8}; // Example input
        int n = input.length; // Example value for 'n'
        System.out.println(findFirstRepeated(input, n));
    }

    public static int findFirstRepeated(int[] array, int n) {
        Set<Integer> seen = new HashSet<>();
        boolean hasValidNumber = false;

        for (int i = 0; i < n; i++) {
            int num = array[i];
            if (num > 0) { // Ignore negative numbers and zeros
                if (seen.contains(num)) {
                    return num; // Return the first repeated number
                } else {
                    seen.add(num);
                    hasValidNumber = true;
                }
            }
        }

        // If no valid number found or all valid numbers are unique
        if (!hasValidNumber) {
            return 0; // All elements are negative or zero
        }
        
        // If no number is repeated, return the first element
        return array.length > 0 ? array[0] : 0;
    }
}