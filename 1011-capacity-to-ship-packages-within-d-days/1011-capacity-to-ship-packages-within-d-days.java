class Solution {
    //BRUTE FORCE


    // private int findDays(int[] arr, int cap){
    //     int load = 0;
    //     int days = 1;

    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] + load > cap){
    //             days++;
    //             load = arr[i];
    //         } else {
    //             load += arr[i];
    //         }
    //     }
    //     return days;
    // }

    // public int shipWithinDays(int[] arr, int d) {
    //     int max = Integer.MIN_VALUE;
    //     int sum = 0;

    //     for(int i = 0; i < arr.length; i++){
    //         sum += arr[i];
    //         max = Math.max(max, arr[i]);
    //     }

    //     // Brute force: try all capacities
    //     for(int cap = max; cap <= sum; cap++){
    //         int days = findDays(arr, cap);

    //         if(days <= d){
    //             return cap; // first valid minimum capacity
    //         }
    //     }

    //     return -1; // never reached
    // }

    //METHOD2-BINARY SEARCH
    private int findDays(int[] arr, int cap){
        int load = 0;
        int days = 1;

        for(int i = 0; i < arr.length; i++){
            load+=arr[i];
            if(load>cap){
                load=arr[i];
                days++;
            }
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