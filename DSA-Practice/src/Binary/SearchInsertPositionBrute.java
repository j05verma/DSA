package Binary;

public class SearchInsertPositionBrute {
    public static int searchInsert(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
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

// Time - O(n)
// Space - O(1)