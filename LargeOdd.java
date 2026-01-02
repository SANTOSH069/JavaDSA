import java.util.Scanner;

public class LargeOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = Integer.parseInt(s);
        int maxOdd = 0;
        boolean founMax = false;
        if(num%2 != 0){
            System.out.println(num);
        }else{

            while(num > 0){
                int n = num%10;
                if(n%2 != 0){
                    maxOdd = Math.max(n, maxOdd);
                    founMax = true;
                }else{
                    continue;
                }
            }
        }
        String  str = String.valueOf(s);
        if(founMax){
            System.out.println(maxOdd);
        }else{
            System.out.println(-1);
        }
        
    }
}
