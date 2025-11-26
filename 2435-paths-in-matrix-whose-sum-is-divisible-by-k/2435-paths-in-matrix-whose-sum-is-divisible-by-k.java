class Solution {
    static final int MOD = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;

        // dp[row][col][rem] = number of ways to reach this cell with remainder rem
        int[][][] dp = new int[m][n][k];

        // initialize dp with -1
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dp[i][j], -1);

        return solve(grid, 0, 0, 0, k, dp);
    }

    public int solve(int[][] grid, int r, int c, int rem, int k, int[][][] dp) {
        int m = grid.length, n = grid[0].length;

        // Out of bounds
        if (r >= m || c >= n) return 0;

        // Update remainder after adding this value
        int newRem = (rem + grid[r][c]) % k;

        // If we reached the destination
        if (r == m - 1 && c == n - 1) {
            return newRem == 0 ? 1 : 0;
        }

        // Memoized answer
        if (dp[r][c][newRem] != -1) return dp[r][c][newRem];

        // Move down and right
        long down = solve(grid, r + 1, c, newRem, k, dp);
        long right = solve(grid, r, c + 1, newRem, k, dp);

        // Save and return
        dp[r][c][newRem] = (int)((down + right) % MOD);
        return dp[r][c][newRem];
    }
}
