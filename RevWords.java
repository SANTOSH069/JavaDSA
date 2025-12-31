import java.util.Scanner;

public class RevWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s); 
        String str = sc.nextLine();
        String [] wr = str.trim().split("\\s+");
        for(int i = wr.length-1; i > 0; i--){
            sb.append(wr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
