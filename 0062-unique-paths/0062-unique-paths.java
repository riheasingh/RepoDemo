class Solution {
    //Recursion +Memoisation

    public int path(int sr,int sc,int er,int ec,int[][]dp){
        if(sr==er || sc==ec)return 0;
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

        //int[][]dp=new int[m][n];
       // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==0 || j==0) dp[i][j]=1;
        //         else dp[i][j]=dp[i][j-1]+dp[i-1][j];
        //     }
        // }
        // return dp[m-1][n-1];

        // tabulation with space optimization
        // int[][] dp=new int[2][n];
        // for(int j=0;j<n;j++){
        //     dp[0][j]=1;
        //     dp[1][j]=1;
        // }
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         dp[1][j]=dp[1][j-1]+dp[0][j];
        //     }
        //     for(int j=1;j<n;j++){
        //         dp[0][j]=dp[1][j];
        //     }
        // }
        
        // return dp[1][n-1];
    }
}