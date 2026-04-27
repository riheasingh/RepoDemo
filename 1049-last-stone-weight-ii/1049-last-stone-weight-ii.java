class Solution {

    Integer[][] dp;
    int target;

    public int lastStoneWeightII(int[] stones) {

        int total = 0;

        for (int stone : stones) {
            total += stone;
        }

        target = total / 2;

        dp = new Integer[stones.length][target + 1];

        int best = solve(0, 0, stones);

        return total - 2 * best;
    }

    public int solve(int i, int sum, int[] stones) {

        if (i == stones.length) {
            return sum;
        }

        if (dp[i][sum] != null) {
            return dp[i][sum];
        }

        // skip current stone
        int skip = solve(i + 1, sum, stones);

        // pick current stone
        int pick = sum;

        if (sum + stones[i] <= target) {
            pick = solve(i + 1, sum + stones[i], stones);
        }

        return dp[i][sum] = Math.max(pick, skip);
    }
}