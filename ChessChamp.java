import java.util.Scanner;

public class ChessChamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int X = sc.nextInt();
        int cp = 0;
        int cf = 0;
        int chp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'C'){
                cp += 2;
            }else if(s.charAt(i) == 'N'){
                cf += 2;
            }else if(s.charAt(i) == 'D'){
                cp += 1;
                cf += 1;
            }else{
                cp += 0;
                cf += 0;
            }
        }
        if(cp > cf || cf > cp){
            chp = 60 * X;
        }else if(cp == cf){
            chp = 55 * X;
        }
        System.out.println(chp);

    }
}
