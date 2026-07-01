package Binary;

import java.util.Arrays;

public class sortArrayByParityBrute {
    public static int[] sortArrayByParity(int[] nums){
        if(nums == null || nums.length == 0)
            return nums;
        int n = nums.length;
        int index = 0;
        int[] result = new int[n];
        // store even number first
        for (int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                result[index++] = nums[i];
            }
        }
        // store odd number second
        for (int i = 0; i < n; i++){
            if(nums[i] % 2 == 1){
                result[index++] = nums[i];
            }
        }
        return result;
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
// Time - O(n) + O(n) = O(n)
// Space - O(n)