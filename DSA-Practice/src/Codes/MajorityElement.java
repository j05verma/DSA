package Codes;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return -1;
        }
        int candidate = nums[0];
        int votes = 1;
        for(int i = 1; i < n; i++){
            if(votes == 0){
                candidate = nums[i];
                votes = 1;
            }
            else if(candidate == nums[i]){
                votes ++;
            }else{
                votes --;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
