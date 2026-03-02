class Solution {
    public int numberOfSubstrings(String s) {
       int n = s.length();
        int i = 0, j = 0;
        int ans = 0;

        int[] freq = new int[3]; // a,b,c

        while(j < n){

            // expand window
            freq[s.charAt(j) - 'a']++;

            // shrink window until invalid
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                ans += (n - j);      // count substrings
                freq[s.charAt(i) - 'a']--;
                i++;
            }

            j++;
        }
        return ans;
    }
}