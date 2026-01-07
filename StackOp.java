import java.util.Stack;

public class StackOp {

    public static int BaseBallSum(String [] ops){
        Stack<Integer> st = new Stack<>();

        for (String op : ops) {

            if (op.equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            }
            else if (op.equals("C")) {
                st.pop();
            }
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }

        int totSum = 0;
        while (!st.isEmpty()) {
            totSum += st.pop();
        }

        return totSum;
    }
    public static void main(String[] args) {
        
    }
}
