package Codes;

import java.util.Arrays;

public class MergeSortedArrayBrute {
    public static void merge(int[] nums1, int m , int[] nums2, int n){
        // first copy nums2 into nums1
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }
        // sorting (bubble sort)
        for(int i = 0; i < m+n; i++){
            for(int j = 0; j < m+n-1; j++){
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
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

// Time - O(n) + O((m+n)2) = O((m+n)2)
// Space - O(1)