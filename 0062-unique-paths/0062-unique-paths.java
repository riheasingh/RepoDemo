class Solution {
    //Recursion +Memoisation

    public int path(int sr,int sc,int er,int ec,int[][]dp){
       // if(sr>=er || sc>=ec)return 0;
        if(sr==er-1 || sc==ec-1) return 1;
        if(dp[sr][sc]!=-1) return dp[sr][sc];
        int downways=path(sr+1,sc,er,ec,dp);
        int rightways=path(sr,sc+1,er,ec,dp);
        return dp[sr][sc]=downways+rightways;

    }
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,m,n,dp);
    }
}