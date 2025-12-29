import java.util.Scanner;

public class SnapStreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int currStr = 0;
        int maxStr = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr1[i] > 0 && arr2[i] > 0){
                currStr += 1;
            }
            else if(arr1[i] == 0 || arr2[i] == 0){
                maxStr = Math.max(currStr,maxStr);
                currStr = 0;
            }
        }
        maxStr = Math.max(currStr,maxStr);
        System.out.println(maxStr);

        
    }
}
