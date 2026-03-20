class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n==0) return true;
        if(arr.length==1 && arr[0]==0 && n==1)return true; 
         if(arr.length==1 && arr[0]==1 && n==1)return false; 
         if(arr[0]==0 && arr[1]==0){
            arr[0]=1;
            n--;
            if(n==0)return true;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==0 && arr[i-1]==0 &&arr[i+1]==0){
                arr[i]=1;
                n--;
                if(n==0)return true;
            }
        }
        if(arr[arr.length-1]==0 && arr[arr.length-2]==0){
            arr[arr.length-1]=1;
               n--;
              if(n==0)return true;
        }
        return false;
    }
}