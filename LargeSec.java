import java.util.*;

public class LargeSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            pq.add(num); 
        }
        int first = pq.poll();
        int second = pq.poll();
        int sum = first + second;
        System.out.print(sum);
        sc.close();

    }
}
