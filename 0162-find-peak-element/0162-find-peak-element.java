class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;
        if(n<=1) return 0;
       
          if(nums[0]>nums[1]) return 0;
       
        // for(int i=1;i<=n-2;i++){
        //     if(nums[i-1]<nums[i] && nums[i]>nums[i+1]) return i;
           
        // }
        int i=1;
        int j=n-2;

        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]<nums[mid+1]){
                 i=mid+1;
            }
            else{
                 j=mid-1;
            }
        }
       return n-1; 
    }
}