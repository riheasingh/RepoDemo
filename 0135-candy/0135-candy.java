class Solution {
    public int candy(int[] arr) {
        int[] ans=new int[arr.length];
        ans[0]=1;
        for(int i=1;i<arr.length;i++){
            ans[i]=(arr[i]>arr[i-1])?ans[i-1]+1: 1;
        }
        for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>arr[i+1]) ans[i]=Math.max(ans[i+1]+1,ans[i]);
        }
        int count=0;
        for(int i=0;i<ans.length;i++){
            count+=ans[i];
        }
        return count;
    }
}