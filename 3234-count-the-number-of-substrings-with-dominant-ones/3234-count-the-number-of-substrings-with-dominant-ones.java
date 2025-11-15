class Solution {
    //Brute Force
//     class Solution {
//     public int numberOfSubstrings(String s) {
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 String st=s.substring(i,j+1);
//                 int noz=0;
//                 int noo=0;
//                 for(int k=0;k<st.length();k++){
//                       char ch=st.charAt(k);
//                       if(ch=='1') noo++;
//                       else noz++;
//                 }
//                 if(noo>=noz*noz) count++;

//             }
//         }
//         return count;
        
//     }
// }
    private long countBadPairs(long A, long B, long t) {
        if (t < 0) return 0;
        if (t >= (A - 1) + (B - 1)) return A * B;

        long L_full = Math.max(0L, t - (B - 1));
        long L_max  = Math.min(A - 1, t);

        long bad = 0;

        if (L_full > 0)
            bad += B * L_full;

        if (L_max >= L_full) {
            long cnt = L_max - L_full + 1;
            long sum = cnt * (t - L_full + 1) - (cnt * (cnt - 1) / 2);
            bad += sum;
        }

        return bad;
    }

    public int numberOfSubstrings(String s) {

        int n = s.length();
        ArrayList<Integer> zeroPos = new ArrayList<>();

        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '0')
                zeroPos.add(i);

        long ans = 0;

        long runOnes = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') runOnes++;
            else {
                ans += runOnes * (runOnes + 1) / 2;
                runOnes = 0;
            }
        }
        ans += runOnes * (runOnes + 1) / 2;

        int m = zeroPos.size();
        int Zmax = (int)Math.sqrt(n);

        for (int z = 1; z <= Zmax && z <= m; z++) {

            long need = z + 1L * z * z;

            for (int i = 0; i + z - 1 < m; i++) {

                int firstZero = zeroPos.get(i);
                int lastZero  = zeroPos.get(i + z - 1);

                int prev = (i == 0) ? -1 : zeroPos.get(i - 1);
                int next = (i + z < m) ? zeroPos.get(i + z) : n;

                long L = firstZero - prev;
                long R = next - lastZero;

                long minLen = lastZero - firstZero + 1L;
                long extra = need - minLen;

                long total = L * R;

                if (extra <= 0) {
                    ans += total;
                    continue;
                }

                long t = extra - 1;
                long bad = countBadPairs(L, R, t);

                ans += (total - bad);
            }
        }

        return (int)ans;
    }
}


