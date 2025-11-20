class Solution {
    public void merge(int[] a,int[] b,int[] arr){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                 arr[k]=a[i];
                 i++;
            }
            else{
                 arr[k]=b[j];
                 j++;
            }
            k++;
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    public void sortColors(int[] nums) {
        
        int n=nums.length;
        if(n==1) return;
          int[] a=new int[n/2];
          int[] b=new int[n-n/2];
          for(int i=0;i<n/2;i++){
            a[i]=nums[i];
          }
    
        for(int i=0;i<n-n/2;i++){
                b[i]=nums[i+n/2];
        }
        sortColors(a);
        sortColors(b);
        merge(a,b,nums);

    

        
    }
}