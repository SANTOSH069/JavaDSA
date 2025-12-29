import java.util.Scanner;

public class AliceBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }
        int l = 0;
        int r = 0;
        int count = 0;
        while(l < a.length && r < b.length){
            if(2*(a[l]) < b[r] || 2*(b[r]) < a[l]){
                l++;
                r++;
            }else{
                count+= 1;
                l++;
                r++;
            }
            l++;
            r++;
        }
        System.out.print(count);
        sc.close();
    }
}
