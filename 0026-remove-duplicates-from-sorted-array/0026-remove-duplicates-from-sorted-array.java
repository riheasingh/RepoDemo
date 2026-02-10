class Solution {
    public int removeDuplicates(int[] nums) {
        // int count=1;
        // int n=nums.length;
        // int i=1;
        // int j=1;
        // while(i<n){
        //     if(nums[i]!=nums[i-1]){
        //         nums[j++]=nums[i];
        //         count++;
                
        //     }
        //     i++;
            
        // }
        // return count;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
}