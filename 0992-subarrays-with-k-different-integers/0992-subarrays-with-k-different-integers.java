class Solution {
    public int atMost(int[] nums,int k){
        int i=0;
        int j=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                int freq=map.get(nums[i]);
                if(freq==1)map.remove(nums[i]);
                else map.put(nums[i],freq-1);
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
         return atMost(nums,k)-atMost(nums,k-1);
    }
}