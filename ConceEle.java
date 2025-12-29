import java.util.HashSet;
import java.util.Scanner;

public class ConceEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
       for(int num : arr){
        set.add(num);
       }
        int c = 1;
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i]-1)){
                c += 1;
            }else{
                c += 0;
            }
        }
        System.out.print(c);
    }
    
}