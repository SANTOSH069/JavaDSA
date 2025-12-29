import java.util.HashSet;
import java.util.Scanner;

public class MatZeros {
    public static void SetZeroes(int [][]mat){
        int n = mat.length;
        int m = mat[0].length;

        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                if(mat[i][j] == 0){
                    st1.add(i);
                    st2.add(j);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(st1.contains(i) || st2.contains(j)){
                    mat[i][j] = 0;
                }
            }
        }

    

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]mat = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        SetZeroes(mat);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
        }
    }
}
