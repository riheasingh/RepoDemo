class Solution {
    public long maximumProduct(int[] nums, int m) {
        // long max=Long.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=m-1+i;j<nums.length;j++){
        //         long prod=(long)nums[i]*nums[j];
        //         max=Math.max(prod,max);
        //     }
        // }
        // return max;

        int n = nums.length;

        long ans = Long.MIN_VALUE;

        int maxVal = nums[0];
        int minVal = nums[0];

        for (int j = m - 1; j < n; j++) {

            int i = j - m + 1;

            maxVal = Math.max(maxVal, nums[i]);
            minVal = Math.min(minVal, nums[i]);

            long p1 = (long) nums[j] * maxVal;
            long p2 = (long) nums[j] * minVal;

            ans = Math.max(ans, Math.max(p1, p2));
        }

        return ans;
    }
}