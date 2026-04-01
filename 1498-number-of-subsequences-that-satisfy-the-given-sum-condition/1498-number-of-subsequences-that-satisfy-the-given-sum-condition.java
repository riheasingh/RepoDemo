class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int mod=1000000007;
        int count=0;
        int[] pow=new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
          pow[i]=(pow[i-1]*2)%mod;
        }
        int l=0;
        int r=n-1;
        while(l<=r){
            if(nums[l]+nums[r]>target)r--;
            else {
                count=(count+pow[r-l])%mod;
                l++;
            }
        }
        return count;

    }
}