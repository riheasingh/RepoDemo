class Solution {
    public int sum(int i,int j,int m,List<List<Integer>> arr,Integer[][]dp){
         if(i==m-1)return arr.get(i).get(j);
        if(dp[i][j]!=null)return dp[i][j];
        int down=sum(i+1,j,m,arr,dp);
        int diagonal=sum(i+1,j+1,m,arr,dp);
        return dp[i][j]=arr.get(i).get(j)+Math.min(down,diagonal);
    }
    public int minimumTotal(List<List<Integer>> arr) {
        int m=arr.size();
        Integer[][] dp = new Integer[m][m];

        
        return sum(0,0,m,arr,dp);
    }
}