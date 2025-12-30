class Solution {
    public boolean isMagic(int[][] grid,int r,int c){
        if(grid[r+1][c+1]!=5) return false;
        boolean [] seen= new boolean [10];

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                int val=grid[i][j];
                if(val<1 || val>9 || seen[val]) return false;
                 seen[val]=true;
            }
           }
        int sum=grid[r][c]+grid[r][c+1]+grid[r][c+2];

        for(int i=r;i<r+3;i++){// row sum
            if(grid[i][c]+grid[i][c+1]+grid[i][c+2]!=sum) return false;
        }
        for(int j=c;j<c+3;j++){// col sum
            if(grid[r][j]+grid[r+1][j]+grid[r+2][j]!=sum) return false;
        }

        if(grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2]!=sum) return false;

        if(grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c]!=sum) return false;

     return true;

    }
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<=n-3;i++){
            for(int j=0;j<=m-3;j++){
                if(isMagic(grid,i ,j)) ans++;

            }
        }
        return ans;
    }
}