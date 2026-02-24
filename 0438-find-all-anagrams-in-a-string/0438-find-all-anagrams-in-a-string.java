class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        // Step 1: store frequency of p
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        // Step 2: traverse string s
        for (int i = 0; i < s.length(); i++) {

            // add current character to window
            winFreq[s.charAt(i) - 'a']++;

            // remove character that goes out of window
            if (i >= k) {
                winFreq[s.charAt(i - k) - 'a']--;
            }

            // Step 3: compare arrays
            if (Arrays.equals(pFreq, winFreq)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}