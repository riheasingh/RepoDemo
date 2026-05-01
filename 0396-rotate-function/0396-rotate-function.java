class Solution {
    // public void  reverse(int i,int j,int[] nums){
    //     while(i<=j){
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
    public int maxRotateFunction(int[] nums) {
        // int n=nums.length;
        // int max=Integer.MIN_VALUE;
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //      k+=i*nums[i];
        // }
        // max=Math.max(k,max);
     
        // for(int i=1;i<nums.length;i++){
        //     int f=0;
        //     reverse(0,n-2,nums);
        //     reverse(n-1,n-1,nums);
        //     reverse(0,n-1,nums);
        //     for(int j=0;j<nums.length;j++){
        //         f+=j*nums[j];
        //     }
        //     max=Math.max(f,max);
        // }
        //return max;
       long sum=0;
       long f=0;
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
         sum+=nums[i];
         f+=i*nums[i];
       }
       long max=f;
       for(int k=1;k<n;k++){
         f=f+sum- (long)n*nums[n-k];
         max=Math.max(f,max);
       }
       return (int)max;
    }
}