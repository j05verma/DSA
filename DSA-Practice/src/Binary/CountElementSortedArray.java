package Binary;

public class CountElementSortedArray {
    public static int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                result = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
    public static int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                result = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
    public static int countElements(int[] nums, int target){
        int first = findFirst(nums, target);
        if(first == -1){
            return 0;
        }
        int last = findLast(nums, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3};
        int target = 2;
        System.out.println(countElements(nums, target));
    }
}
