import java.util.Arrays;
import java.util.Scanner;


public class minmax {

    public static int  minMax(int[] arr, int idx){
        int res = 0;
        if(idx < arr.length){
            arr[idx] *= 2;
            int min = Arrays.stream(arr).min().getAsInt();
            int max = Arrays.stream(arr).max().getAsInt();
            res = min - max;
        }
        return res;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) nums[i] = sc.nextInt();
        for(int i = 0; i < nums.length; i++){
            min = Math.min(min, minMax(nums, i));
        }
        System.out.println(min);
    }
}