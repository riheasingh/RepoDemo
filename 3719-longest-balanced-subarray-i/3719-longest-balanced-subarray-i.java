class Solution {
    public int longestBalanced(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Integer> disteven=new HashSet<>();
            HashSet<Integer> distodd=new HashSet<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2==0){
                    disteven.add(nums[j]);
                }
                else{
                   distodd.add(nums[j]);
                }

                if(disteven.size()==distodd.size()){
                ans=Math.max(ans,j-i+1);
                 }
            }


        }
        return ans;
}}