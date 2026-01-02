import java.util.ArrayList;
import java.util.Scanner;

public class HappyPref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        ArrayList<String> pref = new ArrayList<>();
        ArrayList<String> suf = new ArrayList<>();
        int j = s.length()-1;
        for(int i = 0;i <= s.length(); i++){
            pref.add(s.substring(i, i+1));
            while(j > 0){
                suf.add(s.substring(j, j-1));
                j--;
            }
        }
        boolean ValidHapp = false;
        for(String word : pref){
            if(pref.contains(word) && suf.contains(word)){
                ValidHapp = true;
                res += word;
                break;
            }
        }

        if(ValidHapp){
            System.out.println(res);
        }else{
            System.out.println("");
        }

    }
}
