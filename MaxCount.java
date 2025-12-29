import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int res[] = new int[2];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num : arr){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
        for(HashMap.Entry<Integer, Integer> en : hash.entrySet()){
            int key = en.getKey();
            int val = en.getValue();
            int max = Integer.MIN_VALUE;
            for(int num : hash.values()){
                if(num >= max){
                    max = num;
                }
            }
            
            if(val == max){
                ls.add(key);
            }
            
            


            
        }
        System.out.println(Arrays.toString(res));
    }
}
