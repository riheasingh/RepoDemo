class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[]neg=new int[n/2];
        int[]pos=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0)neg[j++]=nums[i];
            else pos[k++]=nums[i];
        }
        int[] res=new int[n];
        int t=0;
       for(int l=0;l<n/2;l++){
        res[t++]=pos[l];
        res[t++]=neg[l];
       }
        return res;
        
    }
}