class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long[] preSum=new long[n];
        preSum[0]=nums[0];
        for(int i=1;i<n;i++){
            preSum[i]=preSum[i-1]+nums[i];
        }
        long[] suffMin=new long[n];
        suffMin[n-1]=-1;
        long minSuff=Long.MAX_VALUE;
        for(int i=n-2;i>=0;i--){
            minSuff=Math.min(minSuff,nums[i+1]);
            suffMin[i]=minSuff;
        }
        long score=Long.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            score=Math.max(score,preSum[i]-suffMin[i]);
        }
        return score;
        
    }
}