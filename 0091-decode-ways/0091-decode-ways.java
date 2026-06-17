class Solution {
    public int noOfways(int i,String s,int n,int[] dp){
        if(i==s.length())return 1;
        if(s.charAt(i)=='0')return 0;
        if(dp[i]!=-1)return dp[i];
        int ways=noOfways(i+1,s,n,dp);
        if(i+1<n){
          if(s.charAt(i)=='1'||s.charAt(i)=='2' && s.charAt(i+1)-'0'<=6){
             ways+=noOfways(i+2,s,n,dp);
           }
        }
        return dp[i]=ways;

    }
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return noOfways(0,s,n,dp);
    }
}