class Solution {
    public int profit(int i,int buy,int cap,int[] arr,int[][][]dp){
        if(i==arr.length ||cap==0)return 0;
        if(dp[i][buy][cap]!=-1)return dp[i][buy][cap];
        int profit=0;
        if(buy==1){
            int take=-arr[i]+profit(i+1,0,cap,arr,dp);
            int skip=profit(i+1,1,cap,arr,dp);
            profit=Math.max(take,skip);
        }
        else{
            int take=arr[i]+profit(i+1,1,cap-1,arr,dp);
            int skip=profit(i+1,0,cap,arr,dp);
            profit=Math.max(take,skip);
        }
        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int[][][]dp=new int[n][2][3];
        for(int i=0;i<dp.length;i++){
            for(int buy=0;buy<2;buy++){
                Arrays.fill(dp[i][buy],-1);
            }
        }
        return profit(0,1,2,arr,dp);
    }
}