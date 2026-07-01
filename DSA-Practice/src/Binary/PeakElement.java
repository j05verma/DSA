package Binary;

public class PeakElement {
    public static int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length-1;

        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;

        while ( left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < nums[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("Test case 1");
        int[] arr1 = {1,2,3,1};
        System.out.println("peak index : "+findPeakElement(arr1));
        System.out.println("Test case 2");
        int[] arr2 = {1,2,1,3,5,6,4};
        System.out.println("peak index : "+findPeakElement(arr2));
        System.out.println("Test case 3");
        int[] arr3 = {10,7,6,4};
        System.out.println("peak index : "+findPeakElement(arr3));
    }
}
