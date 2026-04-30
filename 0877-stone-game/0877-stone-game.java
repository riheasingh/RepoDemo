class Solution {

    public boolean stoneGame(int[] piles) {

        int n = piles.length;

        Integer[][] dp = new Integer[n][n];

        int diff = solve(0, n - 1, piles, dp);

        return diff > 0;
    }

    int solve(int i, int j, int[] piles, Integer[][] dp) {

        if (i == j) {
            return piles[i];
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int takeLeft = piles[i] - solve(i + 1, j, piles, dp);

        int takeRight = piles[j] - solve(i, j - 1, piles, dp);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
}