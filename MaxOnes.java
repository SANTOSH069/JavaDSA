import java.util.*;

public class MaxOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int currCount = 0;
        int maxCount = 0;
        int l = 0;
        while(l < arr.length){
            if(arr[l] == 1){
                currCount+= 1;
                l++;
            }else{
                maxCount = Math.max(currCount, maxCount);
                currCount = 0;
                l++;
            }
        }
        maxCount = Math.max(currCount, maxCount);
        System.out.println(maxCount);


    }
}
