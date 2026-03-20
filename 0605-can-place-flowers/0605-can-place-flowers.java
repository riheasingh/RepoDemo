class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len = arr.length;

        for(int i = 0; i < len; i++){
            if(arr[i] == 0){
                int prev = (i == 0) ? 0 : arr[i-1];
                int next = (i == len - 1) ? 0 : arr[i+1];

                if(prev == 0 && next == 0){
                    arr[i] = 1;  // plant flower
                    n--;
                    if(n <= 0) return true;
                }
            }
        }
        return n = 0;
    }
}