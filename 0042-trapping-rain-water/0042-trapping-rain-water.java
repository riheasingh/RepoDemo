class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int[] leftMax=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
        int[] rightMax=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
           rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            water+=waterlevel-arr[i];
        }
        return water;
        
    }
}