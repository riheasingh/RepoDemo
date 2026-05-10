class Solution {
   public int solve(int i, int[] nums, int target,int n, int[] dp) {
        if(i == n - 1) {
            return dp[i] = 0;
        }
        if(dp[i] != -2) {
            return dp[i];
        }
        int result = Integer.MIN_VALUE;
        for(int j = i + 1; j < n; j++) {
           if(Math.abs((long)nums[i] - nums[j]) <= target) {
                int temp = 1 + solve(j, nums, target,n, dp);
                result = Math.max(result, temp);
            }
        }

        return dp[i] = result;
    }
    public int maximumJumps(int[] nums, int target) {
       int n = nums.length;
       int[] dp = new int[n];
       Arrays.fill(dp,-2);
        int result = solve(0, nums, target,n, dp);

        return result < 0 ? -1 : result;
    }
}