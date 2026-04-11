import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();

        int i = 0, ans = 0;

        for (int j = 0; j < nums.length; j++) {

            while (!maxD.isEmpty() && nums[j] > maxD.peekLast()) {
                maxD.pollLast();
            }
            maxD.addLast(nums[j]);

            while (!minD.isEmpty() && nums[j] < minD.peekLast()) {
                minD.pollLast();
            }
            minD.addLast(nums[j]);

            while (maxD.peekFirst() - minD.peekFirst() > limit) {
                if (nums[i] == maxD.peekFirst()) maxD.pollFirst();
                if (nums[i] == minD.peekFirst()) minD.pollFirst();
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}