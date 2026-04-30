class Solution {

    int n;
    Integer[][][] dp;

    public int stoneGameII(int[] piles) {

        n = piles.length;

        // dp[player][i][M]
        dp = new Integer[2][n + 1][n + 1];

        return solve(piles, 1, 0, 1);
    }

    int solve(int[] piles, int player, int i, int M) {

        // no piles left
        if (i >= n) {
            return 0;
        }

        // already calculated
        if (dp[player][i][M] != null) {
            return dp[player][i][M];
        }

        int result;

        // Alice wants maximum stones
        if (player == 1) {
            result = 0;
        }

        // Bob wants minimum stones for Alice
        else {
            result = Integer.MAX_VALUE;
        }

        int stones = 0;

        for (int x = 1; x <= Math.min(2 * M, n - i); x++) {

            stones += piles[i + x - 1];

            // Alice turn
            if (player == 1) {

                result = Math.max(
                        result,
                        stones + solve(piles, 0, i + x, Math.max(M, x))
                );
            }

            // Bob turn
            else {

                result = Math.min(
                        result,
                        solve(piles, 1, i + x, Math.max(M, x))
                );
            }
        }

        return dp[player][i][M] = result;
    }
}