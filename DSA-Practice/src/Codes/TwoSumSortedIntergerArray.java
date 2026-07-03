package Codes;

public class TwoSumSortedIntergerArray {
    public static int[] twoSum(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while( left < right){
            int sum = nums[left] + nums[right];
            if( sum == target){
                return new int[]{left+1, right+1};
            }
            else if(sum < target){
                left ++;
            }
            else{
                right --;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] ans1 = twoSum(nums1, 9);
        System.out.println(ans1[0] + " " + ans1[1]); // 1 2

        int[] nums2 = {2, 3, 4};
        int[] ans2 = twoSum(nums2, 6);
        System.out.println(ans2[0] + " " + ans2[1]); // 1 3
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
