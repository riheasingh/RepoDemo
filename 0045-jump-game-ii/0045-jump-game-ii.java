class Solution {
    public int minJumps(int i,int[] nums,int[]dp){
        if(i>=nums.length-1)return 0;
        if(dp[i]!=-1)return dp[i];
        int ans=Integer.MAX_VALUE;
        for(int jump=1;jump<=nums[i] && i+jump<nums.length;jump++){
            int next=minJumps(i+jump,nums,dp);
            if(next!=Integer.MAX_VALUE)ans=Math.min(ans,1+next);
        }
        return dp[i]=ans;

    }
    public int jump(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return minJumps(0,nums,dp);
    }
}