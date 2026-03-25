class Solution {
    // Check if it's possible to make m bouquets on given day
    private boolean possible(int[] arr, int day, int m, int k) {
        int count = 0;   // consecutive flowers
        int bouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                count++;
            } else {
                bouquets += (count / k);
                count = 0;
            }
        }

        // for last segment
        bouquets += (count / k);

        return bouquets >= m;
    }

    public int minDays(int[] arr, int m, int k) {
        long totalFlowersNeeded = (long) m * k;

        // Not possible case
        if (totalFlowersNeeded > arr.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // find min & max day
        for (int val : arr) {
            low = Math.min(low, val);
            high = Math.max(high, val);
        }

        int ans = -1;

        // Binary Search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(arr, mid, m, k)) {
                ans = mid;
                high = mid - 1; // try smaller day
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}