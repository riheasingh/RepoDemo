class Solution {
    public boolean hasAlternatingBits(int n) {
        String ans=Integer.toBinaryString(n);
        for(int i=0;i<ans.length()-1;i++){
            if(ans.charAt(i)==ans.charAt(i+1))return false;
        }
        return true;
        
    }
}