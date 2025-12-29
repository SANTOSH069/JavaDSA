import java.util.Scanner;

public class CiphEnc {
    public static String encrypt(String str, int k){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char enc = (char)('a' + (ch - 'a' + 3) % 26);
                sb.append(enc);
            }else if(ch >= 'A' && ch <= 'Z'){
                char enc = (char)('A' + (ch - 'A' + 3) % 26);
                sb.append(enc);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static String decrypt(String str, int k){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char enc = (char)('a' + (ch - 'a' + 3) % 26);
                sb.append(enc);
            }else if(ch >= 'A' && ch <= 'Z'){
                char enc = (char)('A' + (ch - 'A' + 3) % 26);
                sb.append(enc);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Encrypted = encrypt(str, 3);
        String Decrypted = decrypt(str,-3); 
        System.out.println("Encrypted String: " + Encrypted);
        System.out.println("Decrypted String: " + Decrypted);
        
    }
}
