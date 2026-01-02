import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HayNeedle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String hay = sc.nextLine();
            String needle = sc.nextLine();
            int k = needle.length();
            ArrayList<Integer>ls = new ArrayList<>();
            for(int i = 0; i <= hay.length() - needle.length(); i++){
                if(hay.substring(i, k+i).equals(needle)){
                    ls.add(i);
                }
            }
            int res;
            
            if(ls.isEmpty()){
                res = -1;
            }
            res = Collections.min(ls);
            System.out.println(res);
    }
}
