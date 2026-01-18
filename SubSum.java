import java.util.Arrays;
import java.util.Scanner;

public class SubSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int left  = 0;
        int target = sc.nextInt();
        int subSum = 0;
        int []res = new int[2];
        boolean isfound = false;
        for(int right = 0; right < arr.length; right++){
            subSum += arr[right];
            while(subSum > target && left <= right){
                subSum -= arr[left];
                left++;
            }
            if(subSum == target){
                res[0] = left + 1;
                res[1] = right + 1;
                isfound = true;
                break;
            }
        }
        if(isfound){
            System.out.println(Arrays.toString(res));
        }else{
            System.out.println(-1);
    }
        
    }
}
