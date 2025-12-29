import java.util.Scanner;

public class RotateArr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int k = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        while(k --> 0){
            int temp = arr[n-1];
            for(int i = n-1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }

        sc.close();
    }
}
