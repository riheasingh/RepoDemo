class Solution {

    public boolean canMake(int[] nums, int maxVal) {

        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // move excess from right to left
        for (int i = nums.length - 1; i > 0; i--) {

            if (arr[i] > maxVal) {

                long extra = arr[i] - maxVal;

                arr[i] = maxVal;

                arr[i - 1] += extra;
            }
        }

        return arr[0] <= maxVal;
    }

    public int minimizeArrayValue(int[] nums) {

        int low = 0;

        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(nums, mid)) {

                ans = mid;

                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}