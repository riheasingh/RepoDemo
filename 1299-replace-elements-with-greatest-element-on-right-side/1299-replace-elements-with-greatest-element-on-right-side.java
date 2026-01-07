class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        arr1[n-1]=-1;
        int max=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,arr[i+1]);
            arr1[i]=max;
        }
        return arr1;
    }
}