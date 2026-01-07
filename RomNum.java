import java.util.Scanner;

public class RomNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.equals("I")){
                c += 1;
            }
            else if(s.equals("V")){
                c += 5;
            }
            if(s.equals("X")){
                c += 10;
            }
            if(s.equals("L")){
                c += 50;
            }
            if(s.equals("C")){
                c += 100;
            }
            if(s.equals("D")){
                c += 500;
            }
            if(s.equals("M")){
                c += 1000;
            }else{
                c += 0;
            }
        }
        System.out.println(c);
    }
}
