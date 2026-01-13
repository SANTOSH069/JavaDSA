import java.util.*;

public class shortPal {

    public static boolean isPalindrome(String s,int l, int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l) != s.charAt(r)){
            return false;
        }
        return isPalindrome(s, l+1, r-1);
    }
    static ArrayList<String> ls = new ArrayList<>();
    public static String ShortPalindrome(String s){
        
        if(isPalindrome(s, 0, s.length()-1)){
            return s;
        }
        String add = s;
        int k = add.length();
        while(k > 0){
            String sub = s.concat(add.substring(k-1,k-2));
            String spal = s.concat(sub);
            if(isPalindrome(spal, 0, k-1)){
                 ls.add(spal);
            }else{
                continue;
            }
            k--;
        }
        String res =    ls.stream()
                                    .min(Comparator.comparingInt(String::length))
                                    .orElse(null);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = ShortPalindrome(s);
        System.out.println(res);
    }
}
