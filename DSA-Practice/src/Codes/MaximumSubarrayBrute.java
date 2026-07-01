package Codes;

public class MaximumSubarrayBrute {
    public static int maxSubArray(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int maxSum = nums[0];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                 sum += nums[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
// time - O(n*n)
// space - O(1)
