import java.util.*;


public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []rats = new int[n];
        int []holes = new int[n];
        int []res = new int[n];
        Arrays.sort(rats);
        Arrays.sort(holes);
        for(int i = 0; i < rats.length; i++){
            int diff = rats[i] - holes[i];
            res[i] = Math.abs(diff);
        }
        System.out.println(Arrays.stream(res).max());
    }
}
