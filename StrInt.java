import java.util.*;

public class StrInt {
    public static Long StrInt(String str){
        long res = Long.parseLong(str);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.newLine();
        Long res = StrInt(s);
        System.out.println(res);
        
    }
}
