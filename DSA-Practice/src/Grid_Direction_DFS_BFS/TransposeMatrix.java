package Grid_Direction_DFS_BFS;

import java.util.Arrays;

public class TransposeMatrix {
    public static void transpose(int[][] matrix) {
        // lower triangle of matrix - swap (i,j) -> (j,i)
        // Swap the lower triangle with the upper triangle
        for(int i = 0 ; i < matrix.length; i++){
            for(int j =0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        // Test Case 1: 3x3 Matrix
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix 1:");
        printMatrix(matrix1);

        transpose(matrix1);

        System.out.println("\nTransposed Matrix 1:");
        printMatrix(matrix1);

        // Test Case 2: 4x4 Matrix
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("\nOriginal Matrix 2:");
        printMatrix(matrix2);

        transpose(matrix2);

        System.out.println("\nTransposed Matrix 2:");
        printMatrix(matrix2);
    }
}

//Time Complexity	O(n²)
//Space Complexity	O(1)