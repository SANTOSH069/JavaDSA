import java.util.HashMap;
import java.util.Scanner;

public class UnqNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for (HashMap.Entry<Integer, Integer> en : map.entrySet()) {
            int  key = en.getKey();
            int  val = en.getValue();
            if(val == 1){
                System.out.println(key);
                break;
            }
            
        }
        sc.close();
    }
}
