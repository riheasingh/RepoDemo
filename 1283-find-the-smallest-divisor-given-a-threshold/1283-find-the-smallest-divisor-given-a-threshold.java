class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int hi=max;
        int d=hi;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i]/mid;
                if(nums[i]%mid!=0)sum++;
            }
            if(sum<=threshold){
                d=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }

        return d;
        
    }
}