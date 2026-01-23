class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max) idx=i;
        }
        for(int i=0;i<nums.length;i++){
            if((nums[i]!=max )&& (max<nums[i]*2)) return -1;
        }
        return idx;
    }
}