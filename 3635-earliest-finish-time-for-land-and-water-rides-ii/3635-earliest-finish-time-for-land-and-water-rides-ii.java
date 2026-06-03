class Solution {
    public int findFinishTime(int[] start1, int[]duration1,int[] start2,int[] duration2){
        int finish1=Integer.MAX_VALUE;
        for(int i=0;i<start1.length;i++){
           finish1=Math.min(start1[i]+duration1[i],finish1);
        }
        int finish2=Integer.MAX_VALUE;
        for(int i=0;i<start2.length;i++){
         finish2=Math.min(Math.max(start2[i],finish1)+duration2[i],finish2);
        }
        return finish2;

    }
    public int earliestFinishTime(int[] start1, int[] duration1, int[] start2, int[] duration2) {
        int landToWater=findFinishTime(start1,duration1,start2,duration2);
        int waterToLand=findFinishTime(start2,duration2,start1,duration1);
        return Math.min(landToWater,waterToLand);
        
    }
}