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
        int l=0;
        int m=0;
        while(l<n/2){
            res[m++]=pos[l];
            res[m++]=neg[l++];
        }
        return res;
        
    }
}