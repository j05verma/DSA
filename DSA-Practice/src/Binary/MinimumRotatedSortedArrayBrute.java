package Binary;

public class MinimumRotatedSortedArrayBrute {
    public static int findMin(int[] nums){
        int n = nums.length;
        if(nums == null || nums.length == 0) {
            return -1;
        }
        if(n == 1){
            return  nums[0];
        }
        int min = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1");
        int[] arr1 = {3,4,5,1,2};
        System.out.println(findMin(arr1));
        System.out.println("Test case 2");
        int[] arr2 = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr2));
        System.out.println("Test case 3");
        int[] arr3 = {11,13,15,17};
        System.out.println(findMin(arr3));
    }
}
// Time - O(n)
// Space - O(1)