package Codes;

public class ContainerWithMostWaterBrute {
    public static int maxWater(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxArea = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int width = j -i;
                int minHeight = Math.min(nums[i], nums[j]);
                int area = width * minHeight;
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 5, 4, 3};
        int[] test2 = {3, 1, 2, 4, 5};
        int[] test3 = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(maxWater(test1));
        System.out.println(maxWater(test2));
        System.out.println(maxWater(test3));
    }
}
// Time - O(n*n)
// Space - O(1)