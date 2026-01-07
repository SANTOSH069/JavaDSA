import java.util.HashMap;
import java.util.Scanner;

public class GoodArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int PrefixSum = 0;
        int c = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        for(int i = 0; i < arr.length; i++){
            PrefixSum += arr[i];
            if(hash.containsKey(PrefixSum)){
                c += 1;
            }else{
                hash.put(PrefixSum, hash.getOrDefault(i, PrefixSum))
            }

        }
    }   
}
