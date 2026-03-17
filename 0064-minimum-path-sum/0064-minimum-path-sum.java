class Solution {
    public int minPathSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,m,n,dp,arr);
    }
        //Recursion +Memoisation

    public int path(int sr,int sc,int er,int ec,int[][]dp,int[][] arr){
        
        if(sr>=er || sc>=ec)return Integer.MAX_VALUE;
        if(sr==er-1  && sc==ec-1) return arr[sr][sc];
        if(dp[sr][sc]!=-1) return dp[sr][sc];
        int downways=path(sr+1,sc,er,ec,dp,arr);
        int rightways=path(sr,sc+1,er,ec,dp,arr);
       return dp[sr][sc] = arr[sr][sc] + Math.min(downways, rightways);

    }
    //  public int minPathSum(int[][] arr) {
    //     int m = arr.length;
    //     int n = arr[0].length;
    //     int[][] dp = new int[m][n];
        
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             dp[i][j] = -1;
    //         }
    //     }
        
    //     return path(0, 0, m, n, dp, arr);
    // }

    // Recursion + Memoisation
    // public int path(int sr, int sc, int er, int ec, int[][] dp, int[][] arr) {
    //     // Out of bounds
    //     if (sr >= er || sc >= ec) return Integer.MAX_VALUE;
        
    //     // Reached destination
    //     if (sr == er - 1 && sc == ec - 1) return arr[sr][sc];
        
    //     // Memoization check
    //     if (dp[sr][sc] != -1) return dp[sr][sc];
        
    //     // Move down and right
    //     int downways = path(sr + 1, sc, er, ec, dp, arr);
    //     int rightways = path(sr, sc + 1, er, ec, dp, arr);
        
    //     // Store and return min path sum
    //     return dp[sr][sc] = arr[sr][sc] + Math.min(downways, rightways);
    // }
    
}