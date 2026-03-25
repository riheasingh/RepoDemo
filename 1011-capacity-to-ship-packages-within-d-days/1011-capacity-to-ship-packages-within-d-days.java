class Solution {
    private int findDays(int[] arr,int cap){
        int load=0;
        int days=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]+load>cap){
                load=arr[i];
                days++;
            }
            else load+=arr[i];
        }
        return days;
    }
    public int shipWithinDays(int[] arr, int d) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int lo=max;
        int hi=sum;
        int ans=hi;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int noDays=findDays(arr,mid);
            if(noDays<=d){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
}}