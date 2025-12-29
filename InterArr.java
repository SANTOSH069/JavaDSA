import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class InterArr {
    public static int[] intersect(int[] nums1, int[] nums2){
        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums2){
            ls.add(num);
        }
        for(int i = 0; i < nums1.length; i++){
            if(ls.contains(nums1[i])){
                ls2.add(nums1[i]);
            }
        }
        Collections.sort(ls2);
        set.addAll(ls2);
        int []res = set.stream().mapToInt(i->i).toArray();
        Arrays.sort(res);
        return res; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []arr = new int[n];
        int []arr2 = new int[m];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        intersect(arr, arr2);
    }
}
