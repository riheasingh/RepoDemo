class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=0;
        int j=1;
        int sum=nums[0];
        int max=sum;
        while(j<nums.length){
           if(nums[j]>nums[i]){
             sum+=nums[j];
                i++;
                j++;
            max=Math.max(max,sum);
           }
           else{
            sum=nums[j];
            i=j;
            j++;
           }
        }
        return max;
    }
}