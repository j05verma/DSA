package Codes;

public class MaximumSubarray {
    public static int maxSum(int[] nums){
        int n = nums.length;
        int maxSum = nums[0];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));
    }
}
// Time - O(n)
// Space - O(1)