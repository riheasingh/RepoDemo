class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
       // sort by end asc; if ends equal, sort by start desc
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(b[0], a[0]);
        });

        int p1 = -1, p2 = -1; // last two distinct chosen points (p1 < p2)
        int count = 0;

        for (int[] in : intervals) {
            int start = in[0], end = in[1];

            // how many of p1,p2 are inside [start, end]
            boolean inP1 = (p1 >= start && p1 <= end);
            boolean inP2 = (p2 >= start && p2 <= end);

            if (inP1 && inP2) {
                // already have two distinct points inside
                continue;
            }

            if (inP2) {
                // exactly one point (p2) inside -> add one distinct point
                // prefer adding 'end' unless it equals p2, then add end-1
                int add;
                if (p2 == end) add = end - 1;
                else add = end;
                // update last two (p1 becomes previous p2)
                p1 = p2;
                p2 = add;
                count += 1;
            } else {
                // no points inside -> add two distinct points: end-1, end
                p1 = end - 1;
                p2 = end;
                count += 2;
            }
        }

        return count;
}}