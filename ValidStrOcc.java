import java.util.*;

class Solution {

    public List<Integer> countWordOccurrences(
            List<String> chunks,
            List<String> queries) {

        HashMap<String, Integer> freq = new HashMap<>();

        // Combine all chunks
        StringBuilder str = new StringBuilder();

        for (String ch : chunks) {
            str.append(ch).append(" ");
        }

        // Remove hyphens
        String cleaned = str.toString().replace("-", "");

        // Split into words
        String[] words = cleaned.split("\\s+");

        // Count frequencies
        for (String word : words) {
            if (!word.isEmpty()) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        // Store answers
        List<Integer> ans = new ArrayList<>();

        for (String q : queries) {
            ans.add(freq.getOrDefault(q, 0));
        }

        return ans;
    }
}


public class ValidStrOcc {


    public static void main(String[] args) {
        Solution sol = new Solution();
        
    }
}
