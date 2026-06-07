class Solution {
    public int largestInteger(int num) {

        char[] arr = Integer.toString(num).toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int maxPos = i;

            for (int j = i + 1; j < arr.length; j++) {

                // same parity + larger digit
                if (arr[j] > arr[maxPos] &&
                   (arr[i] - arr[j]) % 2 == 0) {

                    maxPos = j;
                }
            }

            // swap
            char temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;
        }

        return Integer.parseInt(new String(arr));
    }
}