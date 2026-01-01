import java.util.*;


public class ValidPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        sc.nextLine();
        while(T-->0){
            String s = sc.nextLine();
            ArrayList<Character> openBr = new ArrayList<>();
            ArrayList<Character> closeBr = new ArrayList<>();
            int c = 0;
            for(int ch : s.toCharArray()){
                if(ch == '('){
                    openBr.add('(');
                }else{
                    closeBr.add(')');
                }
            }
            int s1 = openBr.size();
            int s2 = closeBr.size();

            if(s1 == s2){
                System.out.println(0);
            }else{
                if(s1%2 == 0 && s2 == 0){
                    c = s1;
                }else if(s2%2 == 0 && s1 == 0){
                    c = s2;
                }else if(s1%2 == 0 && s2%2 == 0){
                    c = 0;
                }else if(s1%2 != 0 || s2%2 != 0){
                    if(s1%2 != 0){
                        while(s1%2 != 0){
                            s1 += 1;
                            c += 1;
                        }
                    }else{
                        while(s2%2 != 0){
                            s2 += 1;
                            c += 1;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}
