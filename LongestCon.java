import java.util.*;

public class LongestCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int num : arr){
            st.push(num);
        }
        int currLen = 0;
        int maxLen = Integer.MIN_VALUE;
        while(!(st.isEmpty())){
            int top = st.pop();
            int nextTop = st.peek();
            if(top - nextTop != 1){
                maxLen = Math.max(maxLen, currLen);
                currLen = 0;
            }else{
                currLen++;
            }
        }
        maxLen = Math.max(maxLen, currLen);
        System.out.println(maxLen);
    }
}
