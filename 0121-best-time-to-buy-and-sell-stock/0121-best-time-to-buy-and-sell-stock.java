class Solution {
    public int maxProfit(int[] arr) {
        //Brute force -TLE error
         int n=arr.length;
        // int maxProfit=0;
        // int profit=0;
        // for(int i=0;i<=n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i])   profit=arr[j]-arr[i];
        //         maxProfit=Math.max(profit,maxProfit);
        //     }
        // }
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(buyPrice<arr[i]) {
                int  profit=arr[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=arr[i];
            }
        }
 return maxProfit;
 }
}