class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff=0;
        int min=Integer.MAX_VALUE;
        minDiff=nums[k-1]-nums[0];
        min=Math.min(min,minDiff);
        int i=1;
        int j=k;
        while(j<nums.length){
            minDiff=nums[j]-nums[i];
            min=Math.min(minDiff,min);
            i++;
            j++;
        }
        return min;
    }
}