import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class ValidCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []code = new String[n];
        String []businessLine = new String[n];
        boolean []isActive = new boolean[n];
            ArrayList<String> res = new ArrayList<>();
            for(int i = 0; i < n; i ++){
                code[i] = sc.nextLine();
                businessLine[i] = sc.nextLine();
                isActive[i] = sc.nextBoolean();
            }
            for(int i = 0; i < n; i ++){
                if(isActive[i]){
                    if(code[i] != null && code[i].matches("^\\p{Alnum}+$")|| code[i].contains("_") ){
                        if(businessLine[i] != null && (businessLine[i].equals("electronics")) || (businessLine[i].equals("grocery")) || (businessLine[i].equals("pharmacy")) || (businessLine[i].equals("restaurant"))){
                            res.add(code[i]);
                    }
                }
            }
        }
            Collections.sort(res, Comparator.naturalOrder());
            for(String str : res){
                System.out.println(str);
            }
    sc.close();
    }
}   
