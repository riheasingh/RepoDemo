class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot)ans.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot)ans.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot)ans.add(nums[i]);
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}