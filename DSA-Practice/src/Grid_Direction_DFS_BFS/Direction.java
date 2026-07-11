package Grid_Direction_DFS_BFS;

public class Direction {
    public static boolean canReach(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        return dfs(grid,0,0,visited);
    }
    public static boolean dfs(char[][] grid, int i, int j, boolean[][] visited){
        // boundary check and cycle check
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j]){
            return false;
        }
        // destination
        if(grid[i][j] == 'X'){
            return true;
        }
        // mark visited
        visited[i][j] = true;
        char ch = grid[i][j];
        if(ch == 'R')
            return dfs(grid, i ,j + 1, visited);
        if(ch == 'L')
            return dfs(grid, i, j - 1, visited);
        if(ch == 'U')
            return dfs(grid, i - 1, j, visited);
        if(ch == 'D')
            return dfs(grid, i + 1, j, visited);
        return false;
    }
    public static void main(String[] args) {

        // Test 1: simple straight path right then down to X
        char[][] grid1 = {
                {'R', 'R', 'D'},
                {'U', 'D', 'D'},
                {'L', 'R', 'X'}
        };
        System.out.println("Test 1 (expect true): " + canReach(grid1));

        // Test 2: path leads out of bounds (R keeps going right off the edge)
        char[][] grid2 = {
                {'R', 'R', 'R'},
                {'#', '#', '#'},
                {'#', '#', 'X'}
        };
        System.out.println("Test 2 (expect false): " + canReach(grid2));

        // Test 3: path forms a cycle (R then L then R... loops forever without visited check)
        char[][] grid3 = {
                {'R', 'L'},
                {'#', 'X'}
        };
        System.out.println("Test 3 (expect false): " + canReach(grid3));

        // Test 4: start cell itself is destination
        char[][] grid4 = {
                {'X', '#'},
                {'#', '#'}
        };
        System.out.println("Test 4 (expect true): " + canReach(grid4));

        // Test 5: down, down, right, right to reach X
        char[][] grid5 = {
                {'D', '#', '#'},
                {'D', '#', '#'},
                {'R', 'R', 'X'}
        };
        System.out.println("Test 5 (expect true): " + canReach(grid5));

        // Test 6: unknown character breaks the path (returns false immediately)
        char[][] grid6 = {
                {'R', '?', 'X'},
                {'#', '#', '#'}
        };
        System.out.println("Test 6 (expect false): " + canReach(grid6));

        // Test 7: up moves off the top boundary
        char[][] grid7 = {
                {'U', '#'},
                {'#', 'X'}
        };
        System.out.println("Test 7 (expect false): " + canReach(grid7));
    }
}
// Time Complexity: O(m × n)
// Space Complexity: O(m × n)