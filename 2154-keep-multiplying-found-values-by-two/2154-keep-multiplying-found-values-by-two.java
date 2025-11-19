class Solution {
    public int findFinalValue(int[] nums, int original) {
        //For loop
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==original) {
        //         original=original*2;
        //         i=-1;
        //     }
        // }
        // return original;
        //HashSet
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        while(set.contains(original)){
            original=original*2;
        }
        return original;
    }
}