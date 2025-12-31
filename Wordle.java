import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(i)){
                res += 'G';
            }
            else{
                res += 'B';
            }
        }
        System.out.println(res);
    }
}
