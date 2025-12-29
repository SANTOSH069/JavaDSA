import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();
        int []res = new int[2];
        for(int num : arr){
            ls.add(num);
        }
        for(int i = 0; i < arr.length; i++){
            if(ls.contains(target-ls.get(i))){
                res[0] = i;
                res[1] = i+1;
                break;
            }
        }
        for(int num : arr){
            int complement =  target - num;
            if(hash.containsKey(complement)){
                res[0] = hash.get(complement);
                res[1] = Arrays.asList(arr).indexOf(num);
                break;
            }
            
        }
            System.out.println(Arrays.toString(res));
        
    }
}
