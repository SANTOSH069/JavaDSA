import java.util.*;

public class sumBeauty {
    public static int Beauty(String sub){
        int []freq = new int[26];
        Arrays.fill(freq, 0);
        for (int i = 0; i < sub.length(); i++) {
            char ch = sub.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int f : freq) {
            if (f > 0) {
                max = Math.max(max, f);
                min = Math.min(min, f);
            }
        }

        return max - min;
    }

    public static int beautySum(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j < s.length(); j++){
                String sub = s.substring(i,j+1);
                count += Beauty(sub);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "zzxyzz";
        int res = beautySum(str);
        System.out.println(res);
    }
}