class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int n=nums1.length;
        boolean caneven=true;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                boolean find =false;
                for(int j=0;j<i;j++){
                    if(nums1[j]%2!=0){
                        find=true;
                        break;
                    }
                }
                if(!find){
                    caneven=false;
                    break;
                }
                    
            }
        }
        boolean canodd=true;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                boolean find =false;
                for(int j=0;j<i;j++){
                    if(nums1[j]%2!=0){
                        find=true;
                        break;
                    }
                }
                if(!find){
                    canodd=false;
                    break;
                }
                    
            }
        }
       return caneven||canodd;
        
    }
}