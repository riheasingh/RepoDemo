import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        int n = nums.length;

        // 1️⃣ First window
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        // 2️⃣ Process remaining elements
        for (int i = k; i < n; i++) {

            // store result of previous window
            res.add(nums[dq.peekFirst()]);

            // remove elements not in current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // remove smaller values
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);
        }

        // last window
        res.add(nums[dq.peekFirst()]);

        // convert list to array
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}