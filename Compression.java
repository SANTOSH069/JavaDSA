import java.util.HashMap;

public class Compression {
    public static void main(String[] args) {
        String s = "AAAABBBCCDE";
        char []arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        // char []freq = new char[arr.length];
        // for(char ch : arr){
        //     freq[ch]++;
        // }
        HashMap<Character, Integer> hash = new HashMap<>();
        for(char ch : arr){
            hash.put(ch, hash.getOrDefault(ch, 0)+1);
        }

        for(HashMap.Entry<Character, Integer> en : hash.entrySet()){
            char key = en.getKey();
            int val = en .getValue();
            sb.append(key).append(String.valueOf(val));
        }
        System.out.println(sb.toString());

    }
}
