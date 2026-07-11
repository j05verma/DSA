package Grid_Direction_DFS_BFS;

public class MazeDFS {

    public static boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int m = maze.length, n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        return dfs(maze, start[0], start[1], destination, visited);
    }

    private static boolean dfs(int[][] maze, int x, int y, int[] destination, boolean[][] visited) {
        if (visited[x][y]) return false;
        visited[x][y] = true;

        if (x == destination[0] && y == destination[1]) {
            return true;
        }

        int m = maze.length, n = maze[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // up, down, left, right

        for (int[] dir : directions) {
            int nx = x, ny = y;

            // keep rolling until hitting a wall or going out of bounds
            while (nx + dir[0] >= 0 && nx + dir[0] < m
                    && ny + dir[1] >= 0 && ny + dir[1] < n
                    && maze[nx + dir[0]][ny + dir[1]] == 0) {
                nx += dir[0];
                ny += dir[1];
            }

            if (dfs(maze, nx, ny, destination, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Test 1: Example 1 from LeetCode -> expect true
        int[][] maze1 = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        int[] start1 = {0, 4};
        int[] dest1 = {4, 4};
        System.out.println("Test 1 (expect true): " + hasPath(maze1, start1, dest1));

        // Test 2: Example 2 from LeetCode -> expect false
        // (ball can pass through (3,2) but cannot stop there)
        int[][] maze2 = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        int[] start2 = {0, 4};
        int[] dest2 = {3, 2};
        System.out.println("Test 2 (expect false): " + hasPath(maze2, start2, dest2));

        // Test 3: Example 3 from LeetCode -> expect false
        int[][] maze3 = {
                {0, 0, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 0}
        };
        int[] start3 = {4, 3};
        int[] dest3 = {0, 1};
        System.out.println("Test 3 (expect false): " + hasPath(maze3, start3, dest3));

        // Test 4: start is already the destination -> expect true
        int[][] maze4 = {
                {0, 0},
                {0, 0}
        };
        int[] start4 = {0, 0};
        int[] dest4 = {0, 0};
        System.out.println("Test 4 (expect true): " + hasPath(maze4, start4, dest4));

        // Test 5: destination surrounded by walls except from one direction -> expect true
        int[][] maze5 = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0}
        };
        int[] start5 = {0, 0};
        int[] dest5 = {2, 0};
        System.out.println("Test 5 (expect true): " + hasPath(maze5, start5, dest5));

        // Test 6: single row, ball rolls straight to the end -> expect true
        int[][] maze6 = {
                {0, 0, 0, 0, 0}
        };
        int[] start6 = {0, 0};
        int[] dest6 = {0, 4};
        System.out.println("Test 6 (expect true): " + hasPath(maze6, start6, dest6));

        // Test 7: destination unreachable, fully walled off -> expect false
        int[][] maze7 = {
                {0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}
        };
        int[] start7 = {0, 0};
        int[] dest7 = {0, 2};
        System.out.println("Test 7 (expect false): " + hasPath(maze7, start7, dest7));
    }
}

// Time Complexity: O((m × n) × max(m, n))
// So total work = (m × n cells) × (4 directions) × (O(max(m,n)) per roll) = O(m × n × max(m, n))
// Space Complexity: O(m × n)