package DynamicProgramming;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if( nums == null || nums.length == 0){
            return true;
        }
        int finalPosition = nums.length-1;
        for(int i = nums.length-2; i >= 0; i--){
            if(i + nums[i] == finalPosition){
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println("Test Case 1");
        System.out.println(canJump(arr));
        System.out.println("Test Case 2");
        int[] arr1 = {3,2,1,0,4};
        System.out.println(canJump(arr1));
    }
}
