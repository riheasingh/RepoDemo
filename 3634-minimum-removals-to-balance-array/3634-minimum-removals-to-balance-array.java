// class Solution {
//     public int minRemoval(int[] nums, int k) {
//         int min=Integer.MAX_VALUE;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//             int taken=k*nums[i];
//             int count=i;
//            for(int j=i+1;j<nums.length;j++){
//             if(nums[j]>taken) count++;
//             }
//         min=Math.min(min,count);
//         }
//       return min;  
//     }
// }
// class Solution {
//     public int minRemoval(int[] nums, int k) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i < n; i++) {
//             long taken = (long) k * nums[i];
//             int count = i;

//             for (int j = i + 1; j < n; j++) {
//                 if (nums[j] > taken) {
//                     count += (n - j);
//                     break;
//                 }
//             }
//             min = Math.min(min, count);
//         }
//         return min;
//     }
// }
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);   // O(n log n)
        int n = nums.length;

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            while ((long) nums[right] > (long) k * nums[left]) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return n - maxLen;
    }
}

