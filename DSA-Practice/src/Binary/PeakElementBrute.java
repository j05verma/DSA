package Binary;

public class PeakElementBrute {
    public static int findPeakElement(int[] nums){
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[n-1] > nums[n-2]){
            return n-1;
        }
        for(int i = 1; i < n-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1");
        int[] arr1 = {1,2,3,1};
        System.out.println("peak index : "+findPeakElement(arr1));
        System.out.println("Test case 2");
        int[] arr2 = {1,2,1,3,5,6,4};
        System.out.println("peak index : "+findPeakElement(arr2));
        System.out.println("Test case 3");
        int[] arr3 = {10,2,5,6};
        System.out.println("peak index : "+findPeakElement(arr3));
    }
}
// Time - O(n)
// Space - O(1)
