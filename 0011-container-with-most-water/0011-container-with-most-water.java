class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int maxArea=Integer.MIN_VALUE;
        // for(int i=0;i<n-1;i++){
        //     int area=0;
        //     for(int j=i+1;j<n;j++){
        //         int h=Math.min(arr[i],arr[j]);
        //         int b=j-i;
        //         area=h*b;
        //         maxArea=Math.max(area,maxArea);
        //     }
        // }
        int i=0;
        int j=n-1;
        while(i<j){
            int h=Math.min(arr[i],arr[j]);
            int b=j-i;
            int area=h*b;
            maxArea=Math.max(area,maxArea);
            if(arr[i]<arr[j])i++;
            else j--;
        }
         return maxArea;
        
        
    }
}