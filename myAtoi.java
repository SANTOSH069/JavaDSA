import java.util.*;

public class myAtoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = s.trim();
        HashSet<Character> set = new HashSet<>();
        set.add('1');
        set.add('2');
        set.add('3');
        set.add('4');
        set.add('5');
        set.add('6');
        set.add('7');
        set.add('8');
        set.add('9');
        set.add('0');
        for(int i = 0; i < str.length(); i++){
            if(s.charAt(0) == '+' || s.charAt(0) == '-'){
                res += s.valueOf(0);
            }
            
        }
        
    }
}
