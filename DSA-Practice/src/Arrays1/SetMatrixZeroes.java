package Arrays1;

import java.util.Arrays;
// Brute Force
public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++){
            if(matrix[row][j] != 0){
                matrix[row][j] = -1;
            }
        }
    }

    private static void markCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0){
                matrix[i][col] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        setZeroes(matrix1);
        for (int[] row : matrix1) {
            System.out.println(Arrays.toString(row));
        }


        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        setZeroes(matrix);
        System.out.println("Test Case 2");
        System.out.println(Arrays.deepToString(matrix));

    }
}
