class Solution {
    private int max(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int pile:piles){
            max=Math.max(pile,max);
        }
        return max;
    }
    private long totalTime(int[] piles,int k){
          long time=0;
          for(int pile:piles){
            time+=pile/k;
            if(pile%k!=0)time++;
          }
          return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long time=totalTime(piles,mid);
            if(time<=h){
                ans=mid;
                high=mid-1;

            }
            else low=mid+1;
        }
        return ans;
        
    }
}