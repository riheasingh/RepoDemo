class Solution {
    public int solve(int n,int[] dp){
        int finalMax=Integer.MIN_VALUE;
        if(n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        for(int i=1;i<n;i++){
            int breakOnce=i*(n-i);
            int breakFurther=i*solve(n-i,dp);
            int max=Math.max(breakOnce,breakFurther);
            finalMax=Math.max(finalMax,max);
        }
        return dp[n]=finalMax;
    }
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
         return solve(n,dp);
        
    }
}