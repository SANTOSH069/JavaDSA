import java.util.*;

public class Coupan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        int X = sc.nextInt();
        int N = sc.nextInt();
        int []a = new int[N];
        int []b = new int[N];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int s1 = 0;
        int s2 = 0;
        for(int num : a){
            if(num == X){
                s1 = num;
                break;
            }
            if( num >= X){
                s1 += num;
            }
        }
        for(int num : b){
            if(num == X){
                s2 = num;
                break;
            }
            if( num >= X){
                s2 += num;
            }
        }
        int cost;
        if(s1 == X || s2 == X){
            cost = X;

        }
        else{
            cost = Math.max(s1,s2);
        }

        System.out.print(cost);
         sc.close();

    }    catch(Exception e){
        System.out.print("Invalid Input");
    }
   

    }
}