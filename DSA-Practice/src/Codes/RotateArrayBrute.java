package Codes;

import java.util.Arrays;

public class RotateArrayBrute {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];

            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = last;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println("test case 1");
        System.out.println(Arrays.toString(arr));
        System.out.println("test case 2");
        int[] arr1 = {-1,-100,3,99};
        int k1 = 2;
        rotate(arr1, k1);
        System.out.println(Arrays.toString(arr1));
    }
}
