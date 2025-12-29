import java.util.*;

public class MeergeArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();
        int M  = sc.nextInt();
        int [] arr1 = new int[N];
        int [] arr2 = new int[M];
        for(int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j < M; j++){
            arr2[j] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        int l = 0;
        int r = 0;
        while(l < N && r < M){
            if(arr2[r] >= arr1[l]){
                ls.add(arr2[r]);
                r++;
            }
            else{
                ls.add(arr1[l]);
                l++;
            }
        }
        while(l < N){
            ls.add(arr1[l]);
            l++;
        }
        while(r < M){
            ls.add(arr2[r]);
            r++;
        }
        int []res = ls.stream().mapToInt(i -> i).toArray();
        for(int num : res){
            System.out.print(num + " ");
        }
    }
}
