class Solution {
    public boolean stoneGameIX(int[] stones) {

        int zero = 0;
        int one = 0;
        int two = 0;

        // Count remainders
        for (int stone : stones) {

            if (stone % 3 == 0) {
                zero++;
            } 
            else if (stone % 3 == 1) {
                one++;
            } 
            else {
                two++;
            }
        }

        // All stones are divisible by 3
        if (one == 0 && two == 0) {
            return false;
        }

        // Even number of remainder-0 stones
        if (zero % 2 == 0) {
            return one > 0 && two > 0;
        }

        // Odd number of remainder-0 stones
        return Math.abs(one - two) > 2;
    }
}