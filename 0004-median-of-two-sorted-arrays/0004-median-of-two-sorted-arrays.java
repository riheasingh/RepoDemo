class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int m=nums1.length,n=nums2.length;
        int[] ans=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
               ans[k++]=nums1[i++];
            }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<m){
             ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }
      int length=ans.length;
      double median =0;
      
      if(length%2==0){
        double middle1=ans[length/2];
         double middle2=ans[(length/2)-1];
        median=(middle1+middle2)/2;
      }
      else {
        double middle1=ans[length/2];
        median =middle1;
      }
      return median;
    }
}