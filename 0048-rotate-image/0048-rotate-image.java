class Solution {
    public void rotate(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        //transpose
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<m;j++){
        //         arr[i][j]=arr[j][i];
        //     }
        // }
        // //rotate
        // for(int i=0;i<m;i++){
        //     int a=0,b=m-1;
        //     while(a<b){
        //         int  temp=arr[i][a];
        //         arr[i][a]=arr[i][b];
        //         arr[i][b]=temp;
        //     }
        // }
        int[][] rotate=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                rotate[i][j]=arr[n-1-j][i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               arr[i][j]=rotate[i][j];
            }
        }
    
    
    }
}