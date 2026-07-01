package Binary;

public class SearchRotatedSortedArrayBrute {
    public static int search(int[] nums, int target){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                return i;
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

// Time - O(n)
// Space - O(1)