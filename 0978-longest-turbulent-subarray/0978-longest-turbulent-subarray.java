class Solution {
    public int maxTurbulenceSize(int[] arr) {
       int n = arr.length;
        if (n == 1) return 1;

        int max = 1;
        int i = 0;

        for (int j = 1; j < n; j++) {

            int curr = Integer.compare(arr[j - 1], arr[j]);

            if (curr == 0) {
                i = j; // reset window
            } else if (j == n - 1 || 
                       curr * Integer.compare(arr[j], arr[j + 1]) != -1) {

                max = Math.max(max, j - i + 1);
                i = j; // start new window
            }
        }

        return max;
    }
}