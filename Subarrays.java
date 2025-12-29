import java.util.ArrayList;
import java.util.Scanner;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int currSum  = 0;
        int left = 0;
        int right = 0;
        int k = sc.nextInt();
        ArrayList<Integer> res= new ArrayList<>();
        while(right < arr.length){
            currSum += arr[right];
            while(currSum > 0){
                currSum -= arr[left];
                left++;
            }
            if(currSum == k){
                for(int i = left; i <= right; i++){
                    res.add(arr[i]);
                }
            }
            right++;
        }
    }
}
