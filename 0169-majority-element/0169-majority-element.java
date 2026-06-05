class Solution {
    public int majorityElement(int[] nums) {
           //Moore Voting algorithm
           int count=0;
           int ele=0;
           for(int i=0;i<nums.length;i++){
              if(count==0){
                ele=nums[i];
                count++;
              }
              else if(nums[i]==ele) count++;
              else count--;

           }
           int count1=0;
           for(int i=0;i<nums.length;i++){
            if(nums[i]==ele)count1++;
           }
           if(count1>nums.length/2) return ele;
           return -1;
        
        //BRUTE FORCE-0(N*2)
        //  int n=nums.length;
        //  for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[i]==nums[j])count++;
        //     }
        //     if(count>n/2) return arr[i];
        //  }

        //HASHING-0(N)
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int key:map.keySet()){
        //     int val=map.get(key);
        //     if(val>(nums.length/2))return key;
        // }
        // return -1;

        // Arrays.sort(nums);
        // return nums[(nums.length/2)];

    }
    
}
