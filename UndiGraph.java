import java.util.Scanner;

public class UndiGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]mat = new int[n][n];
        int [][]adj = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
                
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != 0){
                    adj[i][j] = 1;
                    adj[j][i] = 1;
                }else{
                    adj[i][j] = 0;
                    adj[j][i] = 0;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
