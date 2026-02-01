public class maxArray {
    public static  subArr(int nums, int left, int right){
        List<List<Integer> ls = new ArrayList<>();

    }
    public static void main(String[] args) {
        int n = 10;
        int []nums = new int[n];
        int left = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length; right++){
            while(currSum < 0){
                currSum -= nums[left];
                left++;
            }
            if(currSum > maxSum){
                maxSum = currSum;

            }
        }
    }
}
