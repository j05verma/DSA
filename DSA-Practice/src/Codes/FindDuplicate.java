package Codes;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static int findDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains((nums[i]))){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        System.out.println(findDuplicate(arr));
    }
}
// Time - O(n)
// Space - O(n)