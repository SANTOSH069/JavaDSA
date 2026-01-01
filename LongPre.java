import java.util.*;

public class LongPre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = 3;
        boolean isGood = false;
        for(int i = 0; i <= s.length()-3; i++){
            if(s.substring(i,k+i).equals("010") || s.substring(i, k+i).equals("101")){
                isGood = true;
            }else{
                continue;
            }
        }
        if(isGood){
            System.out.println("Good");
        }else{
            System.out.println("No");
        }
    }
}
