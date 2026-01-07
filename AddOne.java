import java.util.*;

class AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int idx = -1;

        
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println(-1);
        } else {
            System.out.println(s.substring(0, idx + 1));
        }
    }
}

