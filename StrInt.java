public class StrInt {
    public static void main(String[] args) {

        String s = "word123";
        s = s.trim();

        StringBuilder res = new StringBuilder();
        int num = 0;
        int sign = 1;
        int i = 0;

        // Handle sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Collect digits (skip leading zeros automatically)
        while (i < s.length() && Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i - 1))) {
            res.append(s.charAt(i));
            i++;
        }

        // Convert string digits to number
        for (int j = 0; j < res.length(); j++) {
            num = num * 10 + (res.charAt(j) - '0');
        }

        num *= sign;
        System.out.println(num);
    }
}
