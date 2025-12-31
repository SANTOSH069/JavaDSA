import java.util.*;

public class DiffConc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        String AddOne = "1";
        String AddZero = "0";
        int c = 0;
        for(int i = 0; i < s.length() - 1; i++){
            result.append(s.charAt(i)); 
            if(s.charAt(i) == s.charAt(i+1)){
                if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                    result.append(AddOne);
                    c += 1;
                }else{
                    result.append(AddZero);
                    c +=1;
                }
            }
        }
       
        if(s.length() > 0){
            result.append(s.charAt(s.length() - 1));
        }
        System.out.println(result.toString());
        System.out.println(c);
    }
}
