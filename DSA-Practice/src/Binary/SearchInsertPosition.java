package Binary;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while( left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6};
        int k1 = 5;
        System.out.println("Test case 1");
        System.out.println(searchInsert(arr1,k1));
        System.out.println("Test case 2");
        int[] arr2 = {1,3,5,6};
        int k2 = 2;
        System.out.println(searchInsert(arr2,k2));
        System.out.println("Test case 2");
        int[] arr3 = {1,3,5,6};
        int k3 = 7;
        System.out.println(searchInsert(arr3,k3));
    }
}
// Time - O(lon n)
// Space - O(1)