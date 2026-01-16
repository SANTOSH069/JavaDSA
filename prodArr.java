import java.util.HashMap;
import java.util.Scanner;

public class prodArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int c = 0;
        int k = sc.nextInt();
        for(int num : arr){
            if(num < k){
                c += 1;
            }
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(1,1);
        int prefProd = 1;
        for(int i = 0; i < arr.length; i++){
            prefProd *= arr[i];
            hash.putIfAbsent(prefProd, 1);
        }
        for(int num : hash.keySet()){
            if (num < k){
                c += 1;
            }
        }
        System.out.println(c);
    }
}
