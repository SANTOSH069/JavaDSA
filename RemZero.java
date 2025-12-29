import java.util.ArrayList;
import java.util.Scanner;

public class RemZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int c= 0;
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num : nums){
            if(num == 0){
                c += 1;
            }else{
                ls.add(num);
            }
        }
        while(c-- > 0){
            ls.add(0);
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = ls.get(i);
        }
        for(int num : nums){
            System.out.print(num + " ");
        }
        }
    }

