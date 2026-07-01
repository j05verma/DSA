package Binary;

public class BinarySearchBrute {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                return i;
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
// Time - O(n)
// Space - O(1)