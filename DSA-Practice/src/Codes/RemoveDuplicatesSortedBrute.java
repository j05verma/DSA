package Codes;

import java.util.Arrays;

public class RemoveDuplicatesSortedBrute {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;   // empty array has no elements

        int k = 1;   // count of unique elements, first element is always unique

        // start from index 1, compare each element with the last unique one kept
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];   // found a new unique element, place it at index k
                k++;                 // increase count of unique elements
            }
            // if nums[i] == nums[k-1], it's a duplicate, skip it
        }

        return k;   // number of unique elements
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("Test 1 (expect k=2, [1,2]): k=" + k1 + ", " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("Test 2 (expect k=5, [0,1,2,3,4]): k=" + k2 + ", " + Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}