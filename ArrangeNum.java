import java.util.*;

public class ArrangeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] res = new int[N];
        for(int i = 0;i < A.length; i++){
            A[i] = sc.nextInt();
        }
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num : A){
            if(num >= 0){
                pos.add(num);
            }else{
            neg.add(num);
            }
        }
        int p = 0, n = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0 && p < pos.size()) {
                res[i] = pos.get(p++);
            } else if (n < neg.size()) {
                res[i] = neg.get(n++);
            }
        }
        for(int num : res){
            System.out.print(num + " ");
        }

    }
}
