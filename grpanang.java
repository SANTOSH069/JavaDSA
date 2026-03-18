import java.util.*;

public class grpanang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        HashMap<String,List<String>> hash = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            if(!hash.containsKey(Arrays.sort(str.toCharArray()))){
                hash.put(Arrays.sort(str.toCharArray()),)
        }
}
    }
}   
