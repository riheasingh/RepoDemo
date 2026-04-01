class Solution {
    public int countPairs(int[] nums, int k) {
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 if((i*j)%k==0)count++;
    //             }
    //         }
    //     }
    //  return count;

      Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Step 1: store indices for each value
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        
        int count = 0;
        
        // Step 2: check pairs inside each group
        for (List<Integer> list : map.values()) {
            int size = list.size();
            
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if ((list.get(i) * list.get(j)) % k == 0) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}