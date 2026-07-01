package Codes;

import java.util.Arrays;

public class ProductOfArrayItselfBrute {
    public  static int[] ProductOfArrayItself(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    product *= nums[j];
                }
                result[i] = product;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       int[] res= ProductOfArrayItself(arr);
        System.out.println(Arrays.toString(res));
    }
}
// time - O(n*n)
// space - O(n)