import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){

            boolean isLeader = true;
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    isLeader= false;
                    break;
                }
            }
            if(isLeader){
                ls.add(arr[i]);
            }  
    }
    
        for(int leader : ls){
            System.out.print(leader + " ");
}
}
}