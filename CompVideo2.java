import java.util.*;

public class CompVideo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []A = new int[N];
        int l = 0; 
        int r = 1;
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int count = 1;
        while(l < A.length-1 && r < A.length){
            if(A[l] != A[r]){
                count += 1;
                l++;
                r++;
            }else{
                count += 0;
                l++;
                r++;
            }
        }
        System.out.println(count);
    }
}
