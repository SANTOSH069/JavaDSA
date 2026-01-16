import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int currLen = 1;
        int maxLen = 1;
        for(int i = 1; i < n.length(); i++){
            if(n.charAt(i) == n.charAt(i - 1)){
                currLen++;
            }else{
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }
        }
        maxLen = Math.max(currLen, maxLen);
        System.out.println(maxLen);
    }
    
}
