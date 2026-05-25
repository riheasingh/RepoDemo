class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             if(j-i<=k)return true;
        //         }
        //     }
        // }
        // return false;

        // for(int i=0;i<nums.length;i++){
        //     Set<Integer> set=new HashSet<>();
        //     for(int j=i;j<=Math.min(i+k,nums.length-1);j++){
        //         if(set.contains(nums[j])) return true;
        //         set.add(nums[j]);
        //     }
        // }
        // return false;


        // Set<Integer> set=new HashSet<>();
        // for(int i=0;i<Math.min(k,nums.length);i++){
        //     if(set.contains(nums[i]))return true;
        //     set.add(nums[i]);
        // }
        // for(int i=k;i<nums.length;i++){
        //     if(set.contains(nums[i]))return true;
        //     set.add(nums[i]);
        //     set.remove(nums[i-k]);
        // }
        // return false;

        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (set.contains(nums[i])) return true;

        //     set.add(nums[i]);

        //     if (set.size() > k) {
        //         set.remove(nums[i - k]);
        //     }
        // }
        // return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int diff=Math.abs(i-map.get(nums[i]));
                if(diff<=k)return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}