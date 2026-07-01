package SLIDING_WINDOW;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums){
        if(nums.length == 0) return 0;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left ++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
    public static void main(String[] args) {
        System.out.println("Test Case 1");
        int[] a1 = {2,3,1,2,4,3};
        int k1 = 7;
        System.out.println(minSubArrayLen(k1,a1));
        System.out.println("Test Case 2");
        int[] a2 = {1,4,4};
        int k2 = 4;
        System.out.println(minSubArrayLen(k2,a2));
        System.out.println("Test Case 3");
        int[] a3 = {1,1,1,1,1,1,1,1};
        int k3 = 11;
        System.out.println(minSubArrayLen(k3,a3));
    }
}
//Time: O(n) , total operations ≈ 2n → O(n)
//Space: O(1)