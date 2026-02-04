class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
       int start =0;
        int maxLen=1;
        int[][] dp=new int[n][n]; 
        for(int k=0;k<n;k++){
            int i=0;
            int j=k;
            while(j<n){
                if(i==j) {
                     dp[i][j]=1;
                     
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)) {
                        dp[i][j]=1;
                         start=i;
                       maxLen=Math.max(maxLen,j-i+1);
                       
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1) {
                            dp[i][j]=1;
                             start=i;
                            maxLen=Math.max(maxLen,j-i+1);
                          
                        }
                    }
                }
                i++;
                j++;
            }
        }
        //return maxLen;
       return s.substring(start,maxLen+start);
    
        
    
        
    }
}