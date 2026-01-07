import java.util.Arrays;
import java.util.Scanner;

public class RotStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String G = sc.nextLine();
        char arr[] = s.toCharArray();
        boolean isEqual = false;
        int k = s.length();
        while(k > 0){
            char first = arr[0];
            for(int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = first;
            String rev = Arrays.toString(arr);
            if(G.equals(rev)){
                isEqual = true;
            }
            k--;
        }
        
        System.out.print(isEqual ? "YES" : "NO");
        }   
    }

