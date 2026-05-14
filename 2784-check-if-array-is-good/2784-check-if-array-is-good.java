class Solution {
    public boolean isGood(int[] nums) {
        // Arrays.sort(nums);
        // int max=nums[nums.length-1];
        
        // int[] ans=new int[max+1];
       
        // for(int i=0;i<max;i++){
        //    ans[i]=i+1;
        // }
        // ans[ans.length-1]=max;
        // return Arrays.equals(nums,ans);
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return nums[n - 1] == n - 1;
    }
}