class Solution {
    public int arrayPairSum(int[] nums) {
    //     Arrays.sort(nums);
    //     int i=0;
    //     int sum=0;
    //     while(i<nums.length){
    //         int min=Integer.MAX_VALUE;
    //         for(int j=i;j<i+2;j++){
    //             min=Math.min(min,nums[j]);
    //         }
    //         sum+=min;
    //         i+=2;
    //     }
    //    return sum; 


    //Optimised
    int sum=0;
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i+=2){
        sum+=nums[i];
    }
    return sum;
    }
}