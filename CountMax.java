
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMax {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num : arr) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int value = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> en : hash.entrySet()) {
            int key = en.getKey();
            int freq = en.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                value = key;
            } else if (freq == maxFreq) {
                value = Math.min(value, key);
            }
        }

        System.out.println(value + " " + maxFreq);
    }
}
