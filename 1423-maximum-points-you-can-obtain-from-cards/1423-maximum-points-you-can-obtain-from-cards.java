class Solution {
    public int maxScore(int[] arr, int k) {
       int totalSum=0;
       for(int i=0;i<arr.length;i++){
        totalSum+=arr[i];
       }
       int sum=0;
       int min=0;
       int i=0;
       
       for(int j=0;j<arr.length-k;j++){
        sum+=arr[j];
       }
       min=sum;
       int j=arr.length-k;
       while(j<arr.length){
        sum+=arr[j];
        sum-=arr[i];
        i++;
        j++;
        min=Math.min(min,sum);
       }

     return totalSum-min;
        
    }
}