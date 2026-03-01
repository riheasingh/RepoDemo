class Solution {
    public int longestOnes(int[] nums, int k) {
        //brute Force
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //    int nO1=0;
        //     int nO0=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==1)nO1++;
        //         if(nums[j]==0)nO0++;
        //         if(nO0>k){
        //            break;
        //         }
        //         max=Math.max(max,j-i+1);

        //     }
           
        // }
        // return max;

        //SLIDING WINDOW
        int i=0;
        int j=0;
        int nO1=0;
        int nO0=0;
        int max=0;
        while(j<nums.length){
           if(nums[j]==1)nO1++;
                if(nums[j]==0)nO0++;
                while(nO0>k){
                if(nums[i]==0)nO0--;
                   i++;
                   
                }
                max=Math.max(max,j-i+1);
                j++;
        }
        return max;
    }
}