public class BalStr {
    public boolean isBal(String sub){
        int[] freq = new int[256];   
        
        for(char ch : sub.toCharArray()){
            freq[ch]++;
        }

        int expected = 0;

        for(int i = 0; i < 256; i++){
            if(freq[i] > 0){
                if(expected == 0){
                    expected = freq[i];  
                } else if(freq[i] != expected){
                    return false;
                }
            }
        }
        return true;
    }

    public int longestBalanced(String s) {
        int currLen = 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i, j + 1);
                if(isBal(sub)){
                    currLen = sub.length();
                    maxLen = Math.max(currLen, maxLen);
                }
            }
        }

        return maxLen;
}

}
