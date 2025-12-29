import java.util.*;

public class CompVid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []A = new int[N];
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int count = 1;
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] != A[i+1]){
                count++;
            }else{
                count += 0;
            }
        }
        System.out.println(count);

    }
}
