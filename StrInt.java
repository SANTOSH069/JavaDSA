public class StrInt {
    public static void main(String[] args) {

        String s = "-91283472332";
        int n = s.length();
        int i = 0;
        int sign = 1;
        int num = 0;
        s = s.trim();

        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }else{
                sign = 1;
            }
            i++;
        }

        while(i < n && (Character.isDigit(s.charAt(i)))){
            num = num * 10 + (s.charAt(i) - '0');

            if(num * sign > Integer.MAX_VALUE){
                System.out.println(Integer.MAX_VALUE);
                return;
            }
            if(num * sign < Integer.MIN_VALUE){
                System.out.println(Integer.MIN_VALUE);
                return;
            }
            i++;
        }
        System.out.println(sign * num);
    }
}
