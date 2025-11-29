class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int ele:nums){
             sum+=ele;
        }
        int rem=sum%k;
        int minOperation=0;
        for(int i=0;i<nums.length;i++){
            while(rem!=0 && nums[i]>0){
                nums[i]=nums[i]-1;
                rem--;
                minOperation++;
            }
           
        }
      return minOperation;
        
    }
}