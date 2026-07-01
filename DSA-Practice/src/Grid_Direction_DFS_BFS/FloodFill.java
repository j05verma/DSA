package Grid_Direction_DFS_BFS;

import java.util.Arrays;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int oldColor = image[sr][sc]; // original color
        if(oldColor == color){
            return image;
        }
        dfs(image, sr, sc, oldColor, color);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int oldColor, int color){
        if(
                i < 0 || i >= image.length ||
                        j < 0 || j >= image[0].length ||
                        image[i][j] != oldColor
        ){
            return;
        }
        image[i][j] = color; // change color
        dfs(image, i+1, j, oldColor, color); // move down
        dfs(image, i-1, j, oldColor, color); // move up
        dfs(image, i, j+1, oldColor, color); // move right
        dfs(image, i, j-1, oldColor, color); // move left
    }

    public static void printImage(int[][] image) {
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {

        FloodFill obj = new FloodFill();

        System.out.println("Test Case 1");

        int[][] image1 = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        printImage(obj.floodFill(image1, 1, 1, 2));
        // Expected:
        // [2, 2, 2]
        // [2, 2, 0]
        // [2, 0, 1]

        System.out.println();

        System.out.println("Test Case 2");

        int[][] image2 = {
                {0,0,0},
                {0,0,0}
        };

        printImage(obj.floodFill(image2, 0, 0, 2));
        // Expected:
        // [2, 2, 2]
        // [2, 2, 2]

        System.out.println();

        System.out.println("Test Case 3");

        int[][] image3 = {
                {0,0,0},
                {0,0,0}
        };

        printImage(obj.floodFill(image3, 0, 0, 0));
        // Expected (no change):
        // [0, 0, 0]
        // [0, 0, 0]
    }
}
// Time Complexity: O(m × n)
// Space Complexity: O(m × n)