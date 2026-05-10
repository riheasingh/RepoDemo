class Solution {

    int n;

    public int solve(int i, int[] nums, int target, int[] dp) {

        if(i == n - 1) {
            return dp[i] = 0;
        }

        if(dp[i] != Integer.MIN_VALUE) {
            return dp[i];
        }

        int result = Integer.MIN_VALUE;

        for(int j = i + 1; j < n; j++) {

            if(Math.abs((long)nums[i] - nums[j]) <= target) {

                int temp = 1 + solve(j, nums, target, dp);

                result = Math.max(result, temp);
            }
        }

        return dp[i] = result;
    }

    public int maximumJumps(int[] nums, int target) {

        n = nums.length;

        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }

        int result = solve(0, nums, target, dp);

        return result < 0 ? -1 : result;
    }
}