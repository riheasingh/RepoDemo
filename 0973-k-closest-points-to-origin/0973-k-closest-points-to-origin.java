class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<points.length;i++){
             int x=points[i][0];
             int y=points[i][1];
             int d=x*x+y*y;
             pq.offer(new int[]{d,x,y});
             if(pq.size()>k)pq.remove();
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            int[] arr=pq.remove();
            ans[i][0]=arr[1];
            ans[i][1]=arr[2];
        }
        return ans;
        
    }
}