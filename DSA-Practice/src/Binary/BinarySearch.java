package Binary;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {-1,0,3,5,9,12};
        int k1 = 9;
        System.out.println("Test case 1");
        System.out.println(search(arr1,k1));
        System.out.println("Test case 2");
        int[] arr2 = {-1,0,3,5,9,12};
        int k2 = 2;
        System.out.println(search(arr2,k2));
    }
}
// Time - O(log n)
// Space - O(1)
