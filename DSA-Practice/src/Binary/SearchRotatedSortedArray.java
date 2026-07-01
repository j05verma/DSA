package Binary;

public class SearchRotatedSortedArray {
    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            // right half sorted
            if(nums[mid] < nums[right]){
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid -1;
                }
            }
            // left half sorted
            else {
                if(target >= nums[left] && target < nums[mid]){
                    right = mid -1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Test case 1");
        int[] arr1 = {4,5,6,7,0,1,2};
        int k1 = 0;
        System.out.println(search(arr1,k1));
        System.out.println("Test case 2");
        int[] arr2 = {4,5,6,7,0,1,2};
        int k2 = 3;
        System.out.println(search(arr2,k2));
        System.out.println("Test case 3");
        int[] arr3 = {1};
        int k3 = 0;
        System.out.println(search(arr3,k3));
    }
}
// Time - O(log n)
// Space - O(1)