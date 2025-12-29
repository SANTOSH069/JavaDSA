import java.util.*;

public class LongSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int c = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                c+= 1;
            }else{
                c += 0;
                break;
            }
        }
        System.out.print(c);
        sc.close();

    }
}
