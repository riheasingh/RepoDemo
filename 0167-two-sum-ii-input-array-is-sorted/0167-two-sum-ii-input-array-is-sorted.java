class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        int[] ans=new int[2];
        while(i<j){
            if(nums[i]+nums[j]==target) {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(nums[i]+nums[j]>target) j--;
            else i++;

        }
        return ans;
        
    }
}