import java.util.*;
public class RemDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num : arr){
            if(!(ls.contains(num))){
                ls.add(num);
            }else{
                continue;
            }
        }
        Collections.sort(ls);
        int []res = ls.stream().mapToInt(i -> i).toArray();
        int k = res.length;
        System.out.println(k);
        System.out.println(Arrays.toString(res));
    }
}
