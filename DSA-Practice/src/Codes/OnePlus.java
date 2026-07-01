package Codes;

public class OnePlus {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        System.out.println(java.util.Arrays.toString(result1)); // [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        System.out.println(java.util.Arrays.toString(result2)); // [4, 3, 2, 2]

        int[] digits3 = {9, 9, 9};
        int[] result3 = plusOne(digits3);
        System.out.println(java.util.Arrays.toString(result3)); // [1, 0, 0, 0]

        int[] digits4 = {0};
        int[] result4 = plusOne(digits4);
        System.out.println(java.util.Arrays.toString(result4)); // [1]
    }
}
// Time - O(n) best case O(1)
// Space - O(n)  best case O(1)