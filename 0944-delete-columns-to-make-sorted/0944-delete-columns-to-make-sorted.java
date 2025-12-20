class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;

        // Check each column
        for (int col = 0; col < cols; col++) {
            for (int row = 1; row < rows; row++) {
                // If column is not sorted
                if (strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    count++;
                    break; // move to next column
                }
            }
        }
        return count;
    }
}
