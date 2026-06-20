class Solution {
    public int  profit(int i,int buy,int[] arr,int[][]dp,int fee){
        if(i==arr.length)return 0;
        if(dp[i][buy]!=-1)return dp[i][buy];
        int profit=0;
        if(buy==1){
            int take=-arr[i]+profit(i+1,0,arr,dp,fee);
            int skip=profit(i+1,1,arr,dp,fee);
            profit=Math.max(take,skip);
        }
        else{
            int take=-fee+arr[i]+profit(i+1,1,arr,dp,fee);
            int skip=profit(i+1,0,arr,dp,fee);
            profit=Math.max(take,skip);
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] arr, int fee) {
        int n=arr.length;
        int[][]dp=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return profit(0,1,arr,dp,fee);
    }
}