import java.util.Scanner;

public class strtoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s == null || s.length() == 0){
            System.out.println( false);
        }
        int i = 0;
        int num = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        while( i < s.length() && s.charAt(i) == '-'){
            sign = -1;
        }
        s = s.trim();
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            num += num * 10 + (s.charAt(i)- '0');
            if(sign * num > Integer.MAX_VALUE){
                System.out.println(Integer.MAX_VALUE);
            }
            if(sign * num < Integer.MIN_VALUE){
                System.out.println(Integer.MIN_VALUE);
            }
        }

    }
}
