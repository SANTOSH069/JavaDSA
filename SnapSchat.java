
import java.util.Scanner;
public class SnapSchat {

     public static int MaxStreak(int[]arr){
        int currStr = 0;
        int maxStr = 0;
        int l = 0;
        while(l < arr.length){
            if(arr[l] == 0){
                maxStr = Math.max(currStr, maxStr);
                currStr = 0;
                l++;
            }else{
                currStr += 1;
                l++;
            }
        }
        return maxStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr1 = new int[n];
        int []arr2 = new int[n];
        for (int idx = 0; idx < arr1.length; idx++) {
             arr1[idx] = sc.nextInt();
            
        }
        for (int idx = 0; idx < arr2.length; idx++) {
             arr2[idx] = sc.nextInt();
        }
        int a = MaxStreak(arr1);
        int b = MaxStreak(arr2);
        if(a >b){
            System.out.println("Om");
            return;
        }
        else if(b > a){
            System.out.println("Addy");
            return;
        }
        else{
            System.out.println("Draw");
            return;
        }
        

    }
}
