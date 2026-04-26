import java.util.*;

public class LargestEleK {

    public static int maxEle(Deque<Integer> dq){
        int max = Integer.MIN_VALUE;
        for(int num : dq){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        ArrayList<Integer>ls = new ArrayList<>();
        int k = sc.nextInt();
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        Deque<Integer>dq = new ArrayDeque<>();
        for(int right = 0; right < n; right++){
            dq.add(arr[right]);
            while(dq.size() > k){
                dq.removeFirst();
            }
            if(dq.size() == k){
                ls.add(maxEle(dq));
            }
        }
        System.out.println(ls);
    }
}
