package Arrays1;

import java.util.Arrays;

// Better Solution
public class SetMatrixZeroes1 {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];
        // First traversal: mark rows and columns
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        // Second traversal: set marked rows and columns to zero
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
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
