import java.util.Scanner;

public class NumOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int count = 0;
         if(low == high && high%2 != 0 && low%2 != 0){
            System.out.println(1);
        }
        if(low%2 == 0 && high%2 == 0){
            low = low - 1;
            high = high - 1;
        }
        count = ((high - low) / 2) + 1;
        System.out.println(count);
        
    }
}
