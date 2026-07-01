package Grid_Direction_DFS_BFS;

public class NumberOfIsland {
    public int numIslands(char[][] grid){
        if(grid == null || grid.length == 0){
            return 0;
        }
        // store total island
        int count = 0;
        // row number
        for(int i = 0; i < grid.length; i++){
            // column number
            for(int j = 0; j < grid[0].length; j++){
                // found island
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int i, int j){
        if(
                i < 0 || i >= grid.length ||
                j < 0 || j >= grid[0].length ||
                        grid[i][j] == '0'
        ){
            return;
        }
        grid[i][j] = '0'; // mark visited
        // move down
        dfs(grid, i+1, j);
        // move up
        dfs(grid, i-1, j);
        // move right
        dfs(grid, i , j+1);
        // move left
        dfs(grid, i, j-1);
    }
    public static void main(String[] args) {

        NumberOfIsland obj = new NumberOfIsland();

        System.out.println("Test Case 1");

        char[][] grid1 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        System.out.println(obj.numIslands(grid1)); // Expected: 1

        System.out.println("Test Case 2");

        char[][] grid2 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(obj.numIslands(grid2)); // Expected: 3

        System.out.println("Test Case 3");

        char[][] grid3 = {
                {'0','0','0'},
                {'0','0','0'},
                {'0','0','0'}
        };

        System.out.println(obj.numIslands(grid3)); // Expected: 0
    }
}
