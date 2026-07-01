package Codes;

public class MissingNumberBrute {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            boolean found = false;
            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
// Time - O(n*n)
// Space - O(1)