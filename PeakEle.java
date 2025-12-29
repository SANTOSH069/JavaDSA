import java.util.*;

public class PeakEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            ls.add(arr[i]);
        }
        if(arr[0] > arr[1]){
            ls.add(arr[0]);
        }
        if(arr[n-1] > arr[n-2]){
            ls.add(arr[n-1]);
        }
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                ls.add(arr[i]);
            }
        }
        int res[] = new int[ls.size()];
        for(int i = 0; i < ls.size(); i++){
            res[i] = ls.get(i);
        }
        System.out.println(Arrays.toString(res));

    }
}
