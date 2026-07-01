package Codes;

import java.util.Arrays;

public class ProductOfArrayItself {
    public  static int[] ProductOfArrayItself(int[] nums){
        int n = nums.length;
        int prodL = 1;
        int prodR = 1;
        int[] res = new int[n];
        // right product
        for(int i = n-1; i >= 0; i--){
            res[i] = prodR;
            prodR *= nums[i];
        }
        // left product
        for(int i = 0; i< n; i++){
            res[i] = prodL * res[i];
            prodL *= nums[i];
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(ProductOfArrayItself(arr)));
    }
}
// Time - O(n) + O(n) = O(n)
// Space = O(n)