import java.util.Arrays;
import java.util.Scanner;

public class PluseOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int con = 0;
        int sum = 0;
        for(int i = n-1; i > 0; i--){
            sum += (Math.powExact(10, con)*arr[i]);
            con += 1;
        }
        arr[n-1] += 1;
        int []res = new int[arr.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        System.out.println(Arrays.toString(res));
    }
}
