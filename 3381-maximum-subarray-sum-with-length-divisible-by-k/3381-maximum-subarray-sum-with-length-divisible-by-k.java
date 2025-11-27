class Solution {
    //BRUTE FORCE
    
    // public long maxSubarraySum(int[] nums, int k) {
    //     int n=nums.length;
    //   long max=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         long sum=0;
    //         int count=0;
    //         for( int j=i;j<n;j++){
    //            sum+=nums[j];
    //            count++;
    //            if(count%k==0){
    //             max=Math.max(max,sum);
    //            }
    //         }
    //     }
    //     return max;
        
    // }
    //KADANE'S ALGORITHM
    public long maxSubarraySum(int[] nums, int k) {
    int n=nums.length;
      long max=Long.MIN_VALUE;
      long[] prefixSum=new long[n];
      prefixSum[0]=nums[0];
      for(int i=1;i<n;i++){
        prefixSum[i]=prefixSum[i-1]+nums[i];
      }
      long result=Long.MIN_VALUE;
      for(int start=0;start<k;start++){
        long currSum=0;
        int i=start;
        while(i<n &&i+k-1<n){
            int j=i+k-1;
            long subSum=prefixSum[j]-((i>0)?prefixSum[i-1]:0);
            currSum=Math.max(subSum,currSum+subSum);
            result=Math.max(currSum,result);
            i+=k;

        }
      }
    
        return result;
        
    }
}
