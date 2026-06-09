class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->y[0]-x[0]);
        if(a>0)pq.offer(new int[]{a,'a'});
        if(b>0)pq.offer(new int[]{b,'b'});
        if(c>0)pq.offer(new int[]{c,'c'});
        String s="";
       while(!pq.isEmpty()){
            int[] curr=pq.poll();
             int len=s.length();
            if(len>=2 && s.charAt(len-1)==(char)curr[1] && s.charAt(len-2)==(char)curr[1]){
                 
                 if(pq.isEmpty())break;
                 int[] next=pq.poll();
                 s+=(char)next[1];
                 next[0]--;
                 if(next[0]>0)pq.offer(next);
                 pq.offer(curr);
            }
            else{
                s+=(char)curr[1];
                curr[0]--;
                if(curr[0]>0)pq.offer(curr);
            }
          

        }
        return s;
    }
}