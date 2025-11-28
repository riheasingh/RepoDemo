class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {

        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        // To count components
        int[] components = new int[1]; 
        components[0] = 0;

        dfs(0, -1, graph, values, k, components);

        // +1 because the remaining root component is also a component
        return components[0] + 1;
    }

    private long dfs(int node, int parent, List<List<Integer>> graph,
                     int[] values, int k, int[] components) {

        long sum = values[node];

        for (int nei : graph.get(node)) {
            if (nei == parent) continue;

            long childSum = dfs(nei, node, graph, values, k, components);

            // If child subtree sum divisible, cut it
            if (childSum % k == 0) {
                components[0]++;  
            } else {
                sum += childSum;     // Merge into parent subtree
            }
        }

        return sum;
    }
}
