import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int nums = Integer.parseInt(num);
        int currNum = 0;
        int maxNum = Integer.MAX_VALUE;
        if(nums%2 != 0){
            maxNum = nums;
            System.out.println(maxNum);
            return;
        }
        while(nums != 0){
            currNum = nums%10;
            if(currNum%2 != 0){
                maxNum = Math.max(maxNum, currNum);
            }
            nums /= 10;
         }

         System.out.println(maxNum);
         sc.close();

    }
}
