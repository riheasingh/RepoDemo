import java.util.*;

class Solution {

    public int minJumps(int[] nums) {

        int n = nums.length;

        Map<Integer, List<Integer>> map = new HashMap<>();

        // store prime factor -> indices
        for (int i = 0; i < n; i++) {

            int x = nums[i];

            for (int p = 2; p * p <= x; p++) {

                if (x % p == 0) {

                    map.computeIfAbsent(p, k -> new ArrayList<>()).add(i);

                    while (x % p == 0) x /= p;
                }
            }

            if (x > 1)
                map.computeIfAbsent(x, k -> new ArrayList<>()).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int steps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int i = q.poll();

                if (i == n - 1) return steps;

                // left
                if (i > 0 && !vis[i - 1]) {
                    vis[i - 1] = true;
                    q.offer(i - 1);
                }

                // right
                if (i < n - 1 && !vis[i + 1]) {
                    vis[i + 1] = true;
                    q.offer(i + 1);
                }

                // teleport
                if (isPrime(nums[i])) {

                    List<Integer> list = map.get(nums[i]);

                    if (list != null) {

                        for (int idx : list) {

                            if (!vis[idx]) {
                                vis[idx] = true;
                                q.offer(idx);
                            }
                        }

                        map.remove(nums[i]);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    boolean isPrime(int x) {

        if (x < 2) return false;

        for (int i = 2; i * i <= x; i++) {

            if (x % i == 0)
                return false;
        }

        return true;
    }
}