import java.util.HashMap;

public class BalStr2 {

    public static boolean isBal(String sub){
        HashMap<Character,Integer> hash = new HashMap<>();
        for(char ch : sub.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch, 0)+ 1);
        }
        int value = 0;
        for(HashMap.Entry<Character,Integer> en : hash.entrySet()){
            char key = en.getKey();
            int val = en.getValue();
            if(value == 0){
                value = val;
            }
            if(value != val){
                return false;
            }
        }
        return true;
    }

    public static int longestBalanced(String s){
        int currLen = 0;
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i,j+1);
                currLen = sub.length();
                if(isBal(sub)){
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        
    }
}
