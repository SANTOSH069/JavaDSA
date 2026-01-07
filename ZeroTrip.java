import java.util.*;

public class ZeroTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = findZeroSumTriplets(nums);

        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            for (List<Integer> triplet : result) {
                System.out.println(triplet.get(0) + " " +
                                   triplet.get(1) + " " +
                                   triplet.get(2));
            }
        }
    }

    public static List<List<Integer>> findZeroSumTriplets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums); 

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {


            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));


                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return res;
    }
}
