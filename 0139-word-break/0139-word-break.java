class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
         HashSet<String> set = new HashSet<>(wordDict);
         Boolean[] dp = new Boolean[s.length()];
         return solve(0, s, set, dp);
    }
    public boolean solve(int index, String s,HashSet<String> set,
Boolean[] dp) {

        // reached end
        if (index == s.length()) {
            return true;
        }

        // already solved
        if (dp[index] != null) {
            return dp[index];
        }

        String part = "";

        // build string gradually
        for (int i = index; i < s.length(); i++) {

            part += s.charAt(i);

            // valid word found
            if (set.contains(part)) {

                // solve remaining string
                if (solve(i + 1, s, set, dp)) {

                    return dp[index] = true;
                }
            }
        }

        return dp[index] = false;
    }
}