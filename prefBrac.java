import java.util.*;

public class prefBrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Character> st = new Stack<>();
        int n = sc.nextInt();
        String []arr = new String[n];
        HashSet<Character> set = new HashSet<>();
        set.add('+');
        set.add('-');
        set.add('*');
        set.add('/');
        String res = "";
        for(String str : arr){
            res += str;
        }
        for(int i = 0; i < res.length(); i++){
            if(Character.isDigit(res.charAt(i))){
                st.add(res.charAt(i));
            }
            if(set.contains(res.charAt(i))){
                while()
            }
        }

    }
}
