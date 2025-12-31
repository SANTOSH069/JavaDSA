import java.util.*;

public class ValAna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character,Integer> hash1 = new HashMap<>();
        if(s.length() == t.length()){
            for(char num: s.toCharArray()){
                hash1.put(num, hash1.getOrDefault(num, 0)+1);
            }
            
        }else{
            System.out.println("NO");
        }
    }
}
