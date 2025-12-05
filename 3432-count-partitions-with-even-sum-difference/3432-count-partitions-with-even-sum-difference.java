class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
           nums[i]+=nums[i-1];
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            int left=nums[i];
            int right=nums[n-1]-nums[i];
            int diff=Math.abs(left-right);
            if(diff%2==0) count++;
        }
        return count;
    }
}