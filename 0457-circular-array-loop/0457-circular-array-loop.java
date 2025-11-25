class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int start = 0; start < n; start++) {
            boolean[] visited = new boolean[n];
            int i = start;

            boolean forward = nums[start] > 0;   // required direction

            while (true) {

                // already visited → cycle
                if (visited[i]) return true;
                visited[i] = true;

                // direction changed → invalid loop
                if ((nums[i] > 0) != forward) break;

                int next = ((i + nums[i]) % n + n) % n;

                // one-element loop → invalid
                if (next == i) break;

                i = next;
            }
        }

        return false;
    }
}
// class Solution {
//      public boolean circularArrayLoop(int[] nums) {
//          int n=nums.length;
//           boolean[] ans=new boolean[n];
//         int i=0;
//          while(i<n){ 
//             if(ans[i]==false) ans[i]=true; 
//             else return true; 
//             i=i+nums[i]; 
//             } return false; 
//             } 
//     }

