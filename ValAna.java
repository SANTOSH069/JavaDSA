import java.util.*;

public class ValAna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean isAnang = true;
        HashMap<Character,Integer> wr1 = new HashMap<>();
        HashMap<Character,Integer> wr2 = new HashMap<>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();

        for(char ch : s.toCharArray()){
            wr1.put(ch,  wr1.getOrDefault(ch, 0)+1);
        }
        for(char ch : t.toCharArray()){
            wr2.put(ch,  wr2.getOrDefault(ch, 0)+1);
        }
        for(HashMap.Entry<Character, Integer> en : wr1.entrySet()){
            Character key = en.getKey();
            Integer val = en.getValue();
            ls1.add(val);
        }
        for(HashMap.Entry<Character, Integer> en : wr2.entrySet()){
            Character key = en.getKey();
            Integer val = en.getValue();
            ls2.add(val);
        }
        for(int i = 0; i< ls1.size(); i++){
            if(!(ls2.contains(ls1.get(i)))){
                isAnang = false;
                break;
            }
        }
        System.out.print( isAnang ? "YES" : "NO" );
    }
}
