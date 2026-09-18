package Arrays1;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // Generate a specific row of Pascal's Triangle
    public static List<Integer> generateRow(int row) {
        List<Integer> ansRow = new ArrayList<>();
        long ans = 1;
        // First element is always 1
        ansRow.add(1);
        // Calculate remaining elements using previous element
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
    // Generate complete Pascal's Triangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // Generate each row
        for (int i = 1; i <= numRows; i++) {
            result.add(generateRow(i));
        }
        return result;
    }

    // find element given row and column
    public static int findElement(int row, int col) {
        // Convert to 0-based index
        int r = row - 1;
        int c = col - 1;
        long ans = 1;
        // Calculate C(r, c)
        for (int i = 1; i <= c; i++) {
            ans = ans * (r - i + 1)/i;
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        // Test 1: Generate complete Pascal's Triangle
        int numRows = 5;
        System.out.println("Test 1 - Complete Pascal's Triangle:");
        System.out.println(generate(numRows));

        // Test 2: Find element at given row and column
        int rowNum = 5;
        int colNum = 3;
        System.out.println("\nTest 2 - Find Element:");
        System.out.println("Row = " + rowNum + ", Column = " + colNum);
        System.out.println("Element = " + findElement(rowNum, colNum));


        // Test 3: Generate specific row
        int row = 5;
        System.out.println("\nTest 3 - Generate Specific Row:");
        System.out.println("Row = " + row);
        System.out.println(generateRow(row));
    }
}
