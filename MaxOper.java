import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxOper {

    public int countNonMinimum(int [] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num : nums){
            ls.add(num);
        }
        int min = Collections.min(ls);
        int max = Collections.max(ls);
        int count = 0;
        if(nums.length == 1){
            return 0;
        }
        while(min == max){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        MaxOper mo = new MaxOper();
        int res = mo.countNonMinimum(nums);
        System.out.print(res);
        sc.close();
    }
}
