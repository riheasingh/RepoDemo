class Solution {
    public int maxProfit(int[] arr) {
         int n=arr.length;
        int buyPrice=arr[0];
         int maxProfit=0;
        for(int i=0;i<n;i++){
            if(arr[i]>buyPrice) {
                int profit=arr[i]-buyPrice;
                maxProfit+=profit;
            }
           buyPrice=arr[i];
            
        }
       
        return maxProfit;
        
    }
}