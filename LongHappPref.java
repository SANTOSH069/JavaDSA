import java.util.ArrayList;
import java.util.HashMap;

public class LongHappPref {
        public static String longestHappyPrefix(String s) {
            ArrayList<String> pref = new ArrayList<>();
            ArrayList<String> suff = new ArrayList<>();
            HashMap<String, Integer> hash = new HashMap<>();
            int n = s.length();
            String res = "";
            for(int i = 0; i < s.length(); i++ ){
            String sub = s.substring(0, i + 1);
            String suf = s.substring(n - 1 - i);
            pref.add(sub);
            suff.add(suf);
            for(int str = 0; str < pref.size(); str++){
                if(pref.contains(suff.get(str))){
                    hash.put(pref.get(str),pref.get(str).length());
                }
            }
            for(HashMap.Entry<String,Integer> en : hash.entrySet()){
                String key = en.getKey();
                int val = en.getValue();
                int minLen = Integer.MAX_VALUE;
                if(val < minLen ){
                    minLen = val;
                    res = key;
                }
            }
        }
        return  res;
    }
public static void main(String[] args) {
    
}
}
