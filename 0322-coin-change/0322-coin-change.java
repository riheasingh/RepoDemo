class Solution {
     public int coinCount(int i,int[] coins,int amount,int[][] dp){
        if(i==coins.length){
            if(amount==0)return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1)return dp[i][amount];
        int skip=coinCount(i+1,coins,amount,dp);
        if(amount-coins[i]<0)return dp[i][amount]=skip;
        int take=coinCount(i,coins,amount-coins[i],dp);
        if(take!=Integer.MAX_VALUE)take++;
        return dp[i][amount]=Math.min(skip,take);
    }
    public int coinChange(int[] coins,int amount){
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i],-1);
        int ans=coinCount(0,coins,amount,dp);
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}