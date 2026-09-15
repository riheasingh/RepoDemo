
class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();

        boolean[][] pal = new boolean[n][n];

        // Precompute all palindromic substrings
        for (int len = 1; len <= n; len++) {
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;

                if (s.charAt(l) == s.charAt(r) &&
                    (len <= 2 || pal[l + 1][r - 1])) {
                    pal[l][r] = true;
                }
            }
        }

        // dp[i] = maximum number of valid substrings
        // using first i characters
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // Do not take a substring ending at i-1
            dp[i] = dp[i - 1];

            // Try every palindrome ending at i-1
            for (int j = 0; j <= i - k; j++) {
                if (pal[j][i - 1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[n];
    }}
