import java.util.Scanner;

public class ChefSums {

    public static int findMinPrefixSuffixIndex(int[] arr) {
        int n = arr.length;
        
        // Calculate total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        int prefixSum = 0;
        int minSum = Integer.MAX_VALUE;
        int resultIndex = 0;
        
        // For each index, calculate prefix + suffix
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            int currentSum = prefixSum + suffixSum; // This equals totalSum always
            
            // If you want prefix + suffix without double counting:
            int sum = Math.abs(prefixSum - suffixSum); // or just prefixSum + suffixSum
            
            if (sum < minSum) {
                minSum = sum;
                resultIndex = i;
            }
        }
        
        return resultIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    int N = sc.nextInt();
		    int []arr = new int[N];
            int res = findMinPrefixSuffixIndex(arr);
            System.out.println(res);
        }
}

}