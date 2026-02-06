

public class Longestpref {
    public static void main(String[] args) {
    String s = "haydaymayday";
    String t = "day";
    int k = t.length();
    boolean found = false;

    for (int i = 0; i <= s.length() - k; i++) {
        String sub = s.substring(i, i + k);
        if (sub.equals(t)) {
            System.out.println("Found: " + sub);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Not Found !");
    }
}

}
