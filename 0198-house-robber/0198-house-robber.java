class Solution {
    public int robMoney(int[] nums,int idx,int[] dp){
        if(idx<0) return 0;
        if(idx==0) return nums[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=Math.max(nums[idx]+robMoney(nums,idx-2,dp),robMoney(nums,idx-1,dp));
    }
    public int rob(int[] nums) {
    int n=nums.length;
    int dp[]=new int[n];
    Arrays.fill(dp,-1);
    return robMoney(nums,n-1,dp);
        
    }
}