class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;

        // define search space
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(nums, mid, k)) {
                ans = mid;
                high = mid - 1; // try smaller answer
            } else {
                low = mid + 1;  // need bigger sum
            }
        }

        return ans;
    }

    public boolean isPossible(int[] nums, int mid, int k) {
        int count = 1;
        int sum = 0;

        for (int num : nums) {
            if (sum + num <=mid) {
                sum += num;
            } else {
                count++;
                sum = num;
            }
        }

        return count <= k;
    }
}