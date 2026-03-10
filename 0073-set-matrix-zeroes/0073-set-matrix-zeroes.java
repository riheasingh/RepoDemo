class Solution {
    public void setZeroes(int[][] matrix) {
        // int m = matrix.length;
        // int n = matrix[0].length;

        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(matrix[i][j] == 0){
                    
        //             // mark row
        //             for(int k = 0; k < n; k++){
        //                 if(matrix[i][k] != 0)
        //                     matrix[i][k] = -1;
        //             }

        //             // mark column
        //             for(int k = 0; k < m; k++){
        //                 if(matrix[k][j] != 0)
        //                     matrix[k][j] = -1;
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(matrix[i][j] == -1)
        //             matrix[i][j] = 0;
        //     }
        // }

        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==1 || col[j]==1)
                    matrix[i][j]=0;
            }
        }
    }
}