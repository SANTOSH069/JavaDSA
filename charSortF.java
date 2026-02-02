import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class  charSortF {
 public static String addChar(char ch, int val){
    String res = "";
    while(val > 0){
        res = res + ch;
        val--;
    }
    return res;
}
public static String sortByFrequency(String s) {
    HashMap<Character, Integer> hash = new HashMap<>();
    List<Character> keys = new ArrayList<>();
    List<Integer> vals = new ArrayList<>();
    for(char ch : s.toCharArray()){
        hash.put(ch, hash.getOrDefault(ch, 0) + 1);
    }
    for(HashMap.Entry<Character,Integer> en : hash.entrySet()){
         char key = en.getKey();
         int val = en.getValue();
         keys.add(key);
         vals.add(val);
         Collections.sort(keys, Collections.reverseOrder());
         Collections.sort(vals, Collections.reverseOrder());
    }
    String res = "";
    for(int i = 0; i < keys.size(); i++){
        res += addChar(keys.get(i),vals.get(i));
    }
    return res;
    
}  
public static void main(String[] args) {
    
} 
}
