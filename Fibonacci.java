

public class Fibonacci {

    private static long[] memo;
    public static int Fibonaci(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return Fibonaci(n - 1) + Fibonaci(n - 2);
    }

    public static long FibMem(int n){
        if(n <= 1){
            return  1;
        }
        if(memo[n] != 1){
            return memo[n];
        }
        memo[n] = FibMem(n - 1) + FibMem(n - 2);
        return memo[n];
    }

    public static long fibTab(int n){
        if(n <= 1){
            return 1;
        }
        long []dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++){
            dp[i] = fibTab(n - 1) + fibTab(n - 2);
        }
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(fibTab(n));
    }
}
