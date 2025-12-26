class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=0;
       String ch="";
        for(int i=0;i<stones.length();i++){
           ch=stones.substring(i,i+1);
          if(jewels.contains(ch))n++;
        }
        return n;
    }
}