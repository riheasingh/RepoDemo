 class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Check if overall GCD > 1
        int overallGcd = nums[0];
        for (int num : nums) {
            overallGcd = gcd(overallGcd, num);
        }
        if (overallGcd > 1) return -1;

        // Step 2: Count ones
        int countOnes = 0;
        for (int num : nums) {
            if (num == 1) countOnes++;
        }
        if (countOnes > 0) return n - countOnes;

        // Step 3: Find shortest subarray with gcd == 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currGcd = nums[i];
            for (int j = i + 1; j < n; j++) {
                currGcd = gcd(currGcd, nums[j]);
                if (currGcd == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        // Step 4: Compute total operations
        return (minLen - 1) + (n - 1);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
        }
    }