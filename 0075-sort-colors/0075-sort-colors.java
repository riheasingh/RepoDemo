class Solution {
    //public void merge(int[] a,int[] b,int[] arr){
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     while(i<a.length && j<b.length){
    //         if(a[i]<b[j]){
    //              arr[k]=a[i];
    //              i++;
    //         }
    //         else{
    //              arr[k]=b[j];
    //              j++;
    //         }
    //         k++;
    //     }
    //     while(i<a.length){
    //         arr[k]=a[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<b.length){
    //         arr[k]=b[j];
    //         j++;
    //         k++;
    //     }
    // }
    public void sortColors(int[] nums) {
    //     int n=nums.length;
    //     if(n==1) return;
    //       int[] a=new int[n/2];
    //       int[] b=new int[n-n/2];
    //       for(int i=0;i<n/2;i++){
    //         a[i]=nums[i];
    //       }
    //     for(int i=0;i<n-n/2;i++){
    //             b[i]=nums[i+n/2];
    //     }
    //     sortColors(a);
    //     sortColors(b);
    //     merge(a,b,nums);
      

      // inplace solution -M2
      
        // int zero = 0;
        // int one = 0;
        // int two = 0;

        // // Count frequencies
        // for(int num : nums){

        //     if(num == 0) zero++;
        //     else if(num == 1) one++;
        //     else two++;
        // }

        // int i = 0;

        // // Fill 0s
        // while(zero-- > 0){
        //     nums[i] = 0;
        //     i++;
        // }

        // // Fill 1s
        // while(one-- > 0){
        //     nums[i] = 1;
        //     i++;
        // }

        // // Fill 2s
        // while(two-- > 0){
        //     nums[i] = 2;
        //     i++;
        // }
     int lo=0;
     int hi=nums.length-1;
     int mid=0;
     while(mid<=hi){
        if(nums[mid]==0){
            int temp=nums[lo];
            nums[lo]=nums[mid];
            nums[mid]=temp;

            lo++;
             mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else {
            int temp=nums[mid];
            nums[mid]=nums[hi];
            nums[hi]=temp;
            hi--;

        }
     }
   
    

        
    }
}