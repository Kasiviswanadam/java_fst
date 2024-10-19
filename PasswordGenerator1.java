import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PasswordGenerator1 {
    public static void main(String[] args) {
        int[] input = {12, 2, 36, 10, 217, 36, 5, 36, 15, 10}; // Example input
        int n = input.length; // Example value for 'n'
        System.out.println(generatePassword(input, n));
    }

    public static String generatePassword(int[] array, int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 1: Calculate frequencies of each number
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        
        // Initialize values for parts
        Integer part1 = null;
        Integer part2 = null;
        Integer part3 = null;
        
        // Use priority queues to find the required parts
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue().equals(a.getValue()) ? a.getKey() - b.getKey() : b.getValue() - a.getValue()
        );
        
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue().equals(b.getValue()) ? a.getKey() - b.getKey() : a.getValue() - b.getValue()
        );
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            maxHeap.offer(entry);
            minHeap.offer(entry);
        }
        
        if (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> minEntry = minHeap.poll();
            part1 = minEntry.getKey();
            while (!minHeap.isEmpty() && minHeap.peek().getValue().equals(minEntry.getValue())) {
                part1 = Math.min(part1, minHeap.poll().getKey());
            }
        }
        
        if (!maxHeap.isEmpty()) {
            Map.Entry<Integer, Integer> maxEntry = maxHeap.poll();
            part3 = maxEntry.getKey();
            int highestFrequency = maxEntry.getValue();
            while (!maxHeap.isEmpty() && maxHeap.peek().getValue() == highestFrequency) {
                part3 = Math.max(part3, maxHeap.poll().getKey());
            }
        }
        
        if (!maxHeap.isEmpty()) {
            Map.Entry<Integer, Integer> secondMaxEntry = maxHeap.poll();
            part2 = secondMaxEntry.getKey();
            int secondHighestFrequency = secondMaxEntry.getValue();
            while (!maxHeap.isEmpty() && maxHeap.peek().getValue() == secondHighestFrequency) {
                part2 = Math.max(part2, maxHeap.poll().getKey());
            }
        }
        
        // Return the combined password
        return String.format("%d%d%d", part1 != null ? part1 : 0, part2 != null ? part2 : 0, part3 != null ? part3 : 0);
    }
}