class Solution {
    public int minimumRecolors(String s, int k) {
        int noO=0;
        int noB=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='B')noB++;

        }
        noO=k-noB;
        min=Math.min(min,noO);
        int i=0;
        int j=k;
        while(j<s.length()){
            if(s.charAt(j)=='B' && s.charAt(i)=='W'){
                noO--;
               
            }
            else if(s.charAt(j)=='W' && s.charAt(i)=='B'){
                noO++;
               
            }
            min=Math.min(min,noO);
            i++;
            j++;
        }
       return min; 
    }
   
}