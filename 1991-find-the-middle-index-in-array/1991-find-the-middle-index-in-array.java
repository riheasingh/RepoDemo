class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] preSum=new int[n];
        preSum[0]=nums[0];
        for(int i=1;i<n;i++){
            preSum[i]=nums[i]+preSum[i-1];
        }
        int[] postSum=new int[n];
        postSum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            postSum[i]=nums[i]+postSum[i+1];
        }
         for (int i = 0; i < n; i++) {

            int leftSum = (i == 0) ? 0 : preSum[i - 1];
            int rightSum = (i == n - 1) ? 0 : postSum[i + 1];

            if (leftSum == rightSum) {
                return i;
            }
        }
        
        return -1;
    }
}