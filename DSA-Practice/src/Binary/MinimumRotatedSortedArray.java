package Binary;

public class MinimumRotatedSortedArray {
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
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
// Time - O(log n)
// Space - O(1)