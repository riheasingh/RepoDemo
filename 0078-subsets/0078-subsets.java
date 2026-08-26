class Solution {
    public void solve(int i,int[] nums,List<Integer> curr,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve(i+1,nums,curr,ans);
        curr.remove(curr.size()-1);
        solve(i+1,nums,curr,ans);
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}