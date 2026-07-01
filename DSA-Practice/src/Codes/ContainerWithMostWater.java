package Codes;

public class ContainerWithMostWater {
    public static int maxWater(int[] height){
        int n = height.length;
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = n-1;
        while(left < right){
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]){
                left++;
            }else {
                right --;
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

// Time - O(n)
// Space - O(1)
