import java.util.*;

public class HappyStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            HashSet<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');
            int k = 3;
            boolean isHappy = false;
            
            for(int i = 0; i <= s.length()-k; i++){
                String sub = s.substring(i,i+k);
                boolean allVow = true;
                
                for(int j = 0; j < sub.length(); j++){
                    if(!set.contains(sub.charAt(j))){
                        allVow = false;
                        break;
                    }
                }
                
                if(allVow){
                    isHappy = true;
                    break;
                }
            }
            System.out.println(isHappy ? "Happy" : "Sad");
        }
    }
}
