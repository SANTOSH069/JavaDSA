import java.util.*;

public class SupDish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] Dish= new int[n];
        for(int i = 0; i < Dish.length; i++){
            Dish[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hash = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num : Dish){
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        for(HashMap.Entry<Integer,Integer> en : hash.entrySet()){
            Integer key = en.getKey();
            Integer val = en.getValue();
            if(val > Math.floorDiv(n, 3)){
                ls.add(key);
            }
        }
        Collections.sort(ls);
        for(int num : ls){
            System.out.print(num + " ");
        }
    }
}
