
import java.util.HashSet;

public class RemDup {

    public int RemoveDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int k = set.size();
        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = (int) set.toArray()[i];
        }
        for(int num : res){
            System.out.print(num + " ");
        }
        return k;   
    }
    public static void main(String[] args) {
        
    }
}
