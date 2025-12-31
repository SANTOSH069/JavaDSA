import java.util.Scanner;

public class DnaStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < n; i+=2){

            if(s.charAt(i) == '0' && s.charAt(i+1) == '0'){
                    res += "A";
            }
            else if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                res += "T";
            }
            else if(s.charAt(i) == '1' && s.charAt(i+1) == '0'){
                res += "C";
            }else if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                res += "G";
            }
       }
       System.out.println(res);
    }
}
