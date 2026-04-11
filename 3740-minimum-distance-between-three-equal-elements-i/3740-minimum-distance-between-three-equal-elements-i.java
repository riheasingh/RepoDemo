class Solution {
    public int minimumDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        if(nums.length<=2)return -1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        int good=Math.abs(i-j)+Math.abs(i-k)+Math.abs(j-k);
                        min=Math.min(min,good);
                    }
                }
            }
        }
        return min=(min==Integer.MAX_VALUE)?-1:min;
    }
}