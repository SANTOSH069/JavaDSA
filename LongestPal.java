public class LongestPal {
    static int maxLen = 0;
    static String longestPalindrome = "";

    public static  String LongestPalindrome(String s){
        for(int i = 0; i < s.length(); i++){
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i+1);
        }
        return longestPalindrome;
    }

    public static  void  expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            int currLen = right - left + 1;
            if (currLen > maxLen){
                maxLen = currLen;
                longestPalindrome = s.substring(left, right + 1);
            }
            left--;
            right++;
        }
    }
    public static void main(String[] args) {
        String s = "racecar123321";
        String res = LongestPalindrome(s);
        System.out.println(res);
    }
}
