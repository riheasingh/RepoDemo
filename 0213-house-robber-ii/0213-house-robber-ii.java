class Solution {
    public int robMoney(int[] nums,int idx,int end,int[] dp){
        if(idx>end)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int take=nums[idx]+robMoney(nums,idx+2,end,dp);
        int skip=robMoney(nums,idx+1,end,dp);
        return dp[idx]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[]dp1=new int[n];
        Arrays.fill(dp1,-1);
        int case1=robMoney(nums,0,n-2,dp1);
        int[]dp2=new int[n];
        Arrays.fill(dp2,-1);
        int  case2=robMoney(nums,1,n-1,dp2);
        return Math.max(case1,case2);
        
    }
}