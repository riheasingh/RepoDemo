class Solution {

    public int coinCount(int i, int[] coins, int amount, int[][] dp) {

        if (i == coins.length) {
            if (amount == 0) return 1;
            return 0;
        }

        if (dp[i][amount] != -1) return dp[i][amount];

        int skip = coinCount(i + 1, coins, amount, dp);

        int take = 0;

        if (amount - coins[i] >= 0) {
            take = coinCount(i, coins, amount - coins[i], dp);
        }

        return dp[i][amount] = skip + take;
    }

    public int change(int amount, int[] coins) {

        int[][] dp = new int[coins.length][amount + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        return coinCount(0, coins, amount, dp);
    }
}