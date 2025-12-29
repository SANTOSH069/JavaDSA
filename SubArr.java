import java.util.Scanner;

public class SubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 0;
        int currSum = 0;
        int currLen = 0;
        int maxLen = 0;
        while(right < arr.length){
            currSum += arr[right];
            currLen++;
            while(currSum > 0){
                currSum -= arr[left];
                left++;
                currLen--;
            }
            if(currSum == 0){
                maxLen = Math.max(currLen, maxLen);
            }
            right++;
        }
        System.out.print(maxLen);
    }
}
