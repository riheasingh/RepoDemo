class Solution {
    public int countPrimeSetBits(int left, int right) {

        // primes up to 32
        boolean[] prime = new boolean[33];
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31};
        for(int p : primes) prime[p] = true;

        int count = 0;

        for(int i = left; i <= right; i++){
            int bits = Integer.bitCount(i);
            if(prime[bits]) count++;
        }

        return count;
    }
}