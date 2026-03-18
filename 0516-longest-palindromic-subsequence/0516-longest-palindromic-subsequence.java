class Solution {
    public int lcs(int m,int n,StringBuilder a,StringBuilder b,int[][] dp){
       
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(a.charAt(m)==b.charAt(n)) return dp[m][n]=1+lcs(m-1,n-1,a,b,dp);
        else return dp[m][n]=Math.max(lcs(m-1,n,a,b,dp),lcs(m,n-1,a,b,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder a=new StringBuilder(text1);
        StringBuilder b=new StringBuilder(text2);
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return lcs(m-1,n-1,a,b,dp);
        
        
        
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        return s;
    }
    public int longestPalindromeSubseq(String s) {
        return longestCommonSubsequence(s,reverse(s));
    }
}