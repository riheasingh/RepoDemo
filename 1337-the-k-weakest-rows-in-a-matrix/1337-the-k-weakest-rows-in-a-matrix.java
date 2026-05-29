class Solution {

    private int count(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        int count = 0;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (arr[mid] == 1) {

                count = mid + 1;

                i = mid + 1;
            }
            else {

                j = mid - 1;
            }
        }

        return count;
    }

    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {

            if (a[0] == b[0])
                return a[1] - b[1];

            return a[0] - b[0];
        });

        for (int i = 0; i < m; i++) {

            int noOnes = count(mat[i]);

            pq.offer(new int[]{noOnes, i});
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            ans[i] = pq.poll()[1];
        }

        return ans;
    }
}