class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int n=nums.length;
        int i=1;
        int j=1;
        while(i<n){
            if(nums[i]!=nums[i-1]){
                nums[j++]=nums[i];
                count++;
                
            }
            i++;
            
        }
        return count;
        
    }
}