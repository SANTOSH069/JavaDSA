import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class DupRep {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int []res = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            hash.put(num, hash.getOrDefault(num, 0)+ 1);
        }
        for(Map.Entry<Integer,Integer> en : hash.entrySet()){
            int key = en.getKey();
            int val = en.getValue();
            if(val > 1){
                ls.add(key);
            }
        }
        Arrays.sort(arr);
        for(int num : arr){
            set.add(num);
        }
        for(int i = 1; i < arr.length   ; i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        for(int i = 0; i < res.length; i++){
            res[i] = ls.get(i);
        }
        System.out.println(Arrays.toString(res));
   } 
}
