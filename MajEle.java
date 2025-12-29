import java.util.*;

public class MajEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num : arr){
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }
        for (Map.Entry<Integer, Integer> en : hash.entrySet()) {
            Integer key = en.getKey();
            Integer val = en.getValue();
            if(val > Math.floorDiv(n, 2)){
                System.out.print(key);
            }
        }
        

    }
}
