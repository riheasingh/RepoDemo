class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i=0;
        while(i<n){
            if(bits[i]==0){
                if(i==n-1) return true;
                i++;
            } 
            else{
                i+=2;
            }
        }
        return false;
    }
}