import java.util.Scanner;


public class DiffiOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int r = 1;
        boolean flag = true;
        while(r < arr.length-1){
            if(arr[l] <= arr[r]){
                l++;
                r++;
            }else{
                flag = false;
                break;
            }
            l++;
            r++;
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
