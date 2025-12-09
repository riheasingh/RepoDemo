// class Solution {
//     public int specialTriplets(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int ele:nums){
//             map.put(ele,map.getOrDefault(ele,0)+1);
//         }
//         int count=0;
//         for(int key:map.keySet()){
//             int freq=map.get(key);
//             if(freq>=2){
//                 if(map.containsKey(key/2)) count++;
//             }
//         }
//         return count;
        
        
//     }
// }
class Solution {
    public int specialTriplets(int[] nums) {
        // Frequency map of all numbers
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        // Prefix frequency map
        HashMap<Integer, Integer> prefix = new HashMap<>();

        long ans = 0;
        long mod = 1_000_000_007L;

        for (int x : nums) {
            int total = mp.getOrDefault(2 * x, 0);  // total freq of 2*i
            int left = prefix.getOrDefault(2 * x, 0); // prefix freq of 2*i
            int right = total - left;

            if (x == 0) {
                right--;     // match logic from C++ code
            }

            // Update total count
            ans = (ans + (long) left * right) % mod;

            // Increase prefix of the current value
            prefix.put(x, prefix.getOrDefault(x, 0) + 1);
        }

        return (int) ans;
    }
}