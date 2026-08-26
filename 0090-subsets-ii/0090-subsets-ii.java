class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums, current, result);
        return result;
    }

    public void backtrack(int i, int[] nums, List<Integer> current,
                          List<List<Integer>> result) {

        if (i == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Take
        current.add(nums[i]);
        backtrack(i + 1, nums, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Skip duplicates
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        // Skip
        backtrack(i + 1, nums, current, result);
    }
}