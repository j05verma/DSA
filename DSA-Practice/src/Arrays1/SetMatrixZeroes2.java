package Arrays1;

import java.util.Arrays;

// Optimal Solution
public class SetMatrixZeroes2 {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length; // rows
        int m = matrix[0].length; // columns

        int col0 = 1; // track first column
        // Mark rows and columns
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    // Mark current row
                    matrix[i][0] = 0;
                    // Mark current column
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        // First column needs separate tracking
                        col0 = 0;
                    }
                }
            }
        }
        // Set inner matrix cells to zero
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        // Set first row to zero
        if(matrix[0][0] == 0){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        // Set first column to zero
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
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
