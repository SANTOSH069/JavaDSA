import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        int d = sc.nextInt();
        while(d > 0){
            int first = arr[0];
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = first;
            d--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
