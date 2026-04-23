import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(1, k, n, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int num, int k, int target,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // valid combination
        if (target == 0 && current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // invalid cases
        if (num > 9 || target < 0 || current.size() > k) {
            return;
        }

        // ---------------- TAKE ----------------
        current.add(num);

        backtrack(num + 1, k, target - num, current, result);

        current.remove(current.size() - 1);

        // ---------------- SKIP ----------------
        backtrack(num + 1, k, target, current, result);
    }
}