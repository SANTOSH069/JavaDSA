

public class myAtoi {

    public static int myAtoiNum(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        int num = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        return sign * num;
    }

    public static void main(String[] args) {
        String s = " -12345";
        System.out.println(myAtoiNum(s)); 
    }
}
