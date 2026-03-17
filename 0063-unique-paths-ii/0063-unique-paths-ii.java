class Solution {

    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // initialize dp with -1 using i, j
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = -1;
            }
        }

        return solve(0, 0, m, n, grid, dp);
    }

    public int solve(int row, int col, int m, int n, int[][] grid, int[][] dp){

        // ❌ Out of bounds
        if(row >= m || col >= n) return 0;

        // ❌ Obstacle
        if(grid[row][col] == 1) return 0;

        // ✅ Destination
        if(row == m - 1 && col == n - 1) return 1;

        // ✅ Memoization
        if(dp[row][col] != -1) return dp[row][col];

        int down = solve(row + 1, col, m, n, grid, dp);
        int right = solve(row, col + 1, m, n, grid, dp);

        return dp[row][col] = down + right;
    }
}