import java.util.*;

class Solution {

    public long[] distance(int[] arr) {

        HashMap<Integer, List<Integer>> map =
                new HashMap<>();

        // store indices
        for (int i = 0; i < arr.length; i++) {

            map.putIfAbsent(arr[i],
                    new ArrayList<>());

            map.get(arr[i]).add(i);
        }

        long[] ans = new long[arr.length];

        // process each group
        for (List<Integer> list : map.values()) {

            int size = list.size();

            long prefix = 0;

            for (int x : list) {
                prefix += x;
            }

            long leftSum = 0;

            for (int i = 0; i < size; i++) {

                int index = list.get(i);

                prefix -= index;

                long left =
                        (long) index * i
                        - leftSum;

                long right =
                        prefix
                        - (long) index
                        * (size - i - 1);

                ans[index] =
                        left + right;

                leftSum += index;
            }
        }

        return ans;
    }
}