class Solution {

    public List<String> wordBreak(String s,
                                  List<String> wordDict) {

        HashSet<String> set =
                new HashSet<>(wordDict);

        List<String>[] dp =
                new ArrayList[s.length()];

        return solve(0, s, set, dp);
    }

    public List<String> solve(int index,
                              String s,
                              HashSet<String> set,
                              List<String>[] dp) {

        List<String> ans = new ArrayList<>();

        // reached end
        if (index == s.length()) {

            ans.add("");

            return ans;
        }

        // already solved
        if (dp[index] != null) {
            return dp[index];
        }

        String part = "";

        // build substring gradually
        for (int i = index; i < s.length(); i++) {

            part += s.charAt(i);

            // valid word found
            if (set.contains(part)) {

                List<String> temp =
                        solve(i + 1, s, set, dp);

                for (String str : temp) {

                    // last word
                    if (str.equals("")) {

                        ans.add(part);

                    } else {

                        ans.add(part + " " + str);
                    }
                }
            }
        }

        return dp[index] = ans;
    }
}