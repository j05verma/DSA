package Binary;

import java.util.Arrays;

public class sortArrayByParity {
    public static int[] sortArrayByParity(int[] nums){
        if(nums == null || nums.length == 0)
            return nums;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left] % 2 == 0){
                left ++;
            }
            else if(nums[right] % 2 == 1){
                right --;
            }
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left ++;
                right --;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println("Test case 1");
        int[] arr1 = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr1)));
        System.out.println("Test case 2");
        int[] arr2 = {4,5,6,7,0,1,2};
        System.out.println(Arrays.toString(sortArrayByParity(arr2)));
        System.out.println("Test case 3");
        int[] arr3 = {0};
        System.out.println(Arrays.toString(sortArrayByParity(arr3)));
    }
}

// Time -  O(n)
// Space - O(1)