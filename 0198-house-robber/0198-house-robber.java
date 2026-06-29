class Solution {
    public int maxAmount(int i,int[] nums,int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+maxAmount(i+2,nums,dp);
        int skip=maxAmount(i+1,nums,dp);
        return dp[i]=Math.max(take,skip);
    }
   public int rob(int[] nums) {
       int n=nums.length;
       int[] dp=new int[n];
       Arrays.fill(dp,-1);
        return maxAmount(0,nums,dp);
    }
}