import java.util.Scanner;

public class RevPair {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int c = 0;
            if(arr[n-1] > arr[n]){
                c += 1;
            }
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > 2*arr[i+1]){
                    c +=1;
                }else{
                    c += 0;
                }
            }
            System.out.print(c);
            sc.close();
    }
}
