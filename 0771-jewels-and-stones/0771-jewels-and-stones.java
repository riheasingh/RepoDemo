class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=0;
        
        for(int i=0;i<stones.length();i++){
          String ch=stones.substring(i,i+1);
          if(jewels.contains(ch))n++;
        }
        return n;
    }
}