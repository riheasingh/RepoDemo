class Solution {

    public int minimumCost(int[] nums) {

        int[] newArr = Arrays.copyOf(nums, nums.length);

        // Sort only elements after index 0
        Arrays.sort(newArr, 1, newArr.length);

        // nums[0] must be included
        return newArr[0] + newArr[1] + newArr[2];
    }
}
