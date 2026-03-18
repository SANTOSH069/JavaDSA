import java.util.Arrays;
import java.util.Scanner;

public class minsub {

    public static int minEle(int[] nums, int i, int j) {
        int[] res = Arrays.copyOfRange(nums, i, j+1);
        return Arrays.stream(res).min().getAsInt();
    }


    public static int minSub(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                sum += minEle(nums, i, j);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int res = minSub(nums);
        System.out.println(res);
    }
}
