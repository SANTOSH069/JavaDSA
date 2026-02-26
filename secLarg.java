import java.util.*;

public class secLarg {
    public static int secLarge(int[] arr){
        Stack<Integer> st = new Stack<>();
        Arrays.sort(arr);
        for(int num : arr){
            st.push(num);
        }
        int top = st.pop();
        int nexTop = st.peek();
        if(top == nexTop){
            return -1;
        }
        return nexTop;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,10,10};
        int res = secLarge(arr);
        System.out.println(res);
    }
}
