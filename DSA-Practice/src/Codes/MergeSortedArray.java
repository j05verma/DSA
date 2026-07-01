package Codes;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        // using here three pointer
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;
        merge(arr1,m,arr2,n);
        System.out.println("Test case 1");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Test case 2");
        int[] nums1 = {1};
        int m1 = 1;
        int[] nums2 = {};
        int n1= 0;
        merge(nums1,m1,nums2,n1);
        System.out.println(Arrays.toString(nums1));
    }
}
