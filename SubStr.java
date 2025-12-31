import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int i = 0;
        boolean isPart = false;
        while(i <= s1.length() - s2.length()){
            if(s1.substring(i, i + s2.length()).equals(s2)){
                isPart = true;
                break;
            }
            else{
                i++;
            }
        }
        if(isPart){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
