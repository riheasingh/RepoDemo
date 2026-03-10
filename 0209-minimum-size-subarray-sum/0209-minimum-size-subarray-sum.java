class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
       int minLen = Integer.MAX_VALUE;
        
        //Brute force
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;

        //     for (int j = i; j < n; j++) {
        //         sum += nums[j];

        //         if (sum >= target) {
        //             minLen = Math.min(minLen, j - i + 1);
        //             break;
        //         }
        //     }
        // }

        // return minLen == Integer.MAX_VALUE ? 0 : minLen;

       //SLIDING WINDOW
        int i = 0, j = 0;
        int sum = 0;
        

        while (j < nums.length) {
            sum += nums[j];

            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i];
                i++;
            }

            j++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;


        
    }
}