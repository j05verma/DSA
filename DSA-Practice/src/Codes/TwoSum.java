package Codes;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,12};
        int tar = 15;
        System.out.println(Arrays.toString(twoSum(arr, tar)));
    }
}
// time - O(n)
// space - O(n)