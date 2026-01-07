import java.util.*;

class LongPref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        String pref = strs[0];
        int k = pref.length();

        while (k > 0) {
            String target = pref.substring(0, k);

            boolean allMatch = Arrays.stream(strs)
                                     .allMatch(s -> s.startsWith(target));

            if (allMatch) {
                System.out.print(target);
                return;
            }
            k--;
        }

        System.out.print(""); 
    }
}
