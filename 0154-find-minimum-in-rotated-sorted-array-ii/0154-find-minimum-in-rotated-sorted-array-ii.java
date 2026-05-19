class Solution {

    public int findMin(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int mid = i + (j - i) / 2;

            // Minimum is in right half
            if (nums[mid] > nums[j]) {

                i = mid + 1;
            }

            // Minimum is in left half including mid
            else if (nums[mid] < nums[j]) {

                j = mid;
            }

            // Duplicates: cannot decide
            else {

                j--;
            }
        }

        return nums[i];
    }
}