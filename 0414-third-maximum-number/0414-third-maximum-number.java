class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]) arr.add(nums[i]);
        }
        if(arr.size()==1)return arr.get(0);
        else if (arr.size()==2)return arr.get(1);
        else return arr.get(arr.size()-3);
        

        
    }
}