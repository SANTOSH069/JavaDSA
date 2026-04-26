import java.util.*;

public class Deques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Deque<Character> dq = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            ls.add(ch);
        }
        int k = 2;
        Collections.sort(ls);
        for(char ch : ls){
            dq.addFirst(ch);
        }
        while( k > 0  && !dq.isEmpty()){
                dq.removeLast();
                k--;
        }
        while(!dq.isEmpty()){
            sb.append(dq.removeFirst());
        }
        if(sb.charAt(0) == '0'){
            
        }
    }
}
