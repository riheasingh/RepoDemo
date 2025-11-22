class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        if(x<0) return false;
        int curr=0;
        while(x!=0){
            int rem=x%10;
            curr=curr*10+rem;
            x=x/10;
        }
        return n==curr;
        
    }
}