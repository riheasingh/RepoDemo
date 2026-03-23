class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] ans=new int[arr[arr.length-1]+1];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]=arr[i];
        }
        int count=0;
        int a=0;
        for(int i=1;i<ans.length;i++){
             if(ans[i]==0){
                count++;
                if(count==k){
                    
                    return i;
                   
                } 
             }
        }

        return ans[ans.length-1]+k-count;
        
    }
}