class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
             return b[0]-a[0];
            }
            );
        for(int i=0;i<arr.length;i++){
            int d=Math.abs(x-arr[i]);
            pq.add(new int[]{d,arr[i]});
            if(pq.size()>k)pq.remove();
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
           int[] arr1=pq.remove();
           ans.add(arr1[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}