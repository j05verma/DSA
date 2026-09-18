package Binary;

public class OrderNotKnownSearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        boolean ascending = nums[left] < nums[right];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(ascending){
                if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{
                if(nums[mid] > target){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,7,9,11,15};
        int target1 = 9;
        System.out.println(search(nums1,target1));

        int[] nums2 = {15,11,9,7,3,1};
        int target2 = 9;
        System.out.println(search(nums2,target2));
    }
}
