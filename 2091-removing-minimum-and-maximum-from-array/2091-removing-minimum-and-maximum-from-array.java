class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1)return 1;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        int posmax=-1;
        int posmin=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min)posmin=i;
            if(nums[i]==max)posmax=i;
        }
        int minpos=-1;
        int maxpos=-1;
        if(posmax>posmin){
            minpos=posmin;
            maxpos=posmax;
        }
        else{
            minpos=posmax;
            maxpos=posmin;
        }
        
        int del1=maxpos+1;
        int del2=minpos+1+nums.length-maxpos;
        int del3=n-minpos;
        return Math.min(del1,Math.min(del2,del3));

    }
}