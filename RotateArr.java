import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int first = arr[0];
            for(int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
   

        sc.close();
    }   
}
