class Solution {
    public boolean isValid(int[] nums,int mid,int p){
        int i=0;
        int countPairs=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=mid){
                countPairs++;
                i+=2;
            }
            else i++;
        }
        return countPairs>=p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l=0;
        int r=nums[nums.length-1]-nums[0];
        int result=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValid(nums,mid,p)){
                result=mid;
                r=mid-1;
            }
            else l=mid+1;
        }
        return result;
    }
}