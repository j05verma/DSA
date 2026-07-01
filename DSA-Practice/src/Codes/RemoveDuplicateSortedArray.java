package Codes;

public class RemoveDuplicateSortedArray {
    public static  int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1; i < nums.length; i++){
            if( nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println("Test Case 1");
        int[] arr1 = {1, 1, 2};
        int k1 = removeDuplicates(arr1);
        System.out.println("k = " + k1);
        for (int i = 0; i < k1; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nTest Case 2");
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(arr2);
        System.out.println("k = " + k2);
        for (int i = 0; i < k2; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
// Time - O(n)
// Space - O(n)