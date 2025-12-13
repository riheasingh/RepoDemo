class Solution {
    int mod = 1_000_000_007;

    // Correct power function
    public long pow(long n, long m) {
        if (m == 0) return 1;

        long half = pow(n, m / 2);
        long result = (half * half) % mod;

        if (m % 2 == 1) {
            result = (result * n) % mod;
        }
        return result;
    }
   
    public long count(long n, long ans){
         if (n % 2 == 0) {
           
            ans = (ans * pow(4, n / 2)) % mod;
            ans = (ans * pow(5, n / 2)) % mod;
        } else {
            ans = (ans * pow(5, (n / 2) + 1)) % mod;
            ans = (ans * pow(4, n / 2)) % mod;
        }
        return ans;
    }

    public int countGoodNumbers(long n) {
        if(n==1) return 5;
        long ans = 1;
        long a = count(n, ans);
        return (int)(a % mod);
    }
}

