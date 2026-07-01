package Codes;

class PlusOneBrute {
    public static int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break;
            }
        }

        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
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

// Time - O(n)
// Space - O(1) average case
// O(n) worst case (all 9s)