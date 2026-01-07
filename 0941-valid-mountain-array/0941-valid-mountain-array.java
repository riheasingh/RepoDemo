class Solution {
    public boolean validMountainArray(int[] nums) {
        if(nums.length<3) return false;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        if(max==nums[nums.length-1]||max==nums[0])return false;
        int i=0;
        int j=nums.length-1;
        while(nums[i]<max || nums[j]<max){
            if(nums[i]<max){
                if(nums[i]>= nums[i+1])return false;
                i++;
            }
            if(nums[j]<max ) {
                if(nums[j]>=nums[j-1])return false;
                j--;
             }
         }
        return true;

        
    }
}