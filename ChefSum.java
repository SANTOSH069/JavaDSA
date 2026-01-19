import java.util.Scanner;

public class ChefSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int currSum = 0;
        int minSum = Integer.MIN_VALUE;
        int []prefSum = new int[n];
        int []suffSum = new int[n];
        prefSum[0] = arr[0];
        suffSum[n - 1] = arr[n - 1];
        for(int i = 0; i < arr.length; i++){
           prefSum[i] = prefSum[i - 1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            suffSum[i] = suffSum[i + 1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            currSum = prefSum[i] + suffSum[i];
            if(currSum < minSum){
                minSum = currSum;
            }
        }
        System.out.println(minSum);
    }
}
