class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int n = customers.length;

        // Step 1: Already satisfied customers
        int satisfied = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        // Step 2: Sliding window for extra customers
        int extra = 0;

        // First window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        int maxExtra = extra;

        // Slide window
        for (int i = minutes; i < n; i++) {

            // Add new element
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            // Remove old element
            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        return satisfied + maxExtra;
    }
}