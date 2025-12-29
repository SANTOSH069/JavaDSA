import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RepMiss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        int res[] = new int[2];
        for(int i= 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int miss  = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i = 1; i < arr.length-1; i++){
            if(!(set.contains(i))){
                miss = i;
            }
        }
        int rep = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num : arr){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
        for(HashMap.Entry<Integer,Integer> en : hash.entrySet()){
            int key = en.getKey();
            int val = en.getValue();
            if(val == 2){
                rep = key;
                break;
            }
        }
        res[0] = rep;
        res[1] = miss;
        System.out.println(Arrays.toString(res));
    }
}