import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class EvenVow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0;
        int r = s.length() - 1;
        ArrayList<Character> ls = new ArrayList<>();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        for(char ch : s.toCharArray()){
            if(hs.contains(s.charAt(ch))){
                ls.add(s.charAt(ch));
            }
        }
        int idx = ls.size();
        boolean  isEven = false;
        while(l <= s.length()-1  && idx > 0){
           for(r = s.length() -1; r >= 0; r--){
            
           }
        }
        if(idx == 0){
            isEven = true;
            System.out.println( isEven);
            sc.close();
            return;
        }
        System.out.println(isEven);
        sc.close();
    }
}
