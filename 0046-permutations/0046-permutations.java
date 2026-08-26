class Solution {
    public void printpermutations(List<Integer> nums,List<Integer> ans,List<List<Integer>> result){
        if(nums.size()==0){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.size();i++){
            int ch=nums.get(i);
            List<Integer> remaining=new ArrayList<>();
            for(int j=0;j<nums.size();j++){
                if(j!=i){
                    remaining.add(nums.get(j));
                }
            }
            ans.add(ch);
            printpermutations(remaining,ans,result);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        List<List<Integer>> result=new ArrayList<>();
        printpermutations(list,new ArrayList<>(),result);
        return result;
    }
}