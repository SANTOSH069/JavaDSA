import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        String T = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M.length(); i++){
            if(M.charAt(i) == T.charAt(i)){
                sb.append("G");
            }else{
                sb.append("B");
            }
        }
        System.out.println(sb.toString());
        sc.close();

    }
}
