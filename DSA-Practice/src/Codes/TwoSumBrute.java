package Codes;

import java.util.Arrays;

public class TwoSumBrute {
    public static int[] sumOfTwo(int[] nums, int target){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,6,8};
        int target = 6;
        System.out.println(Arrays.toString(sumOfTwo(arr,target)));
    }
}
// time - O(n*n)
// space - O(1)
