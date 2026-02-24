class Solution {
    public boolean checkInclusion(String p, String s) {
        if(s.length()<p.length()) return false;
        int[] pfreq=new int[26];
        int[] winfreq=new int[26];
        for(char c:p.toCharArray()){
            pfreq[c-'a']++;
        }
        int k=p.length();
        for(int i=0;i<s.length();i++){
            winfreq[s.charAt(i)-'a']++;
            if(i>=k){
                winfreq[s.charAt(i-k)-'a']--;
            }
            if(Arrays.equals(winfreq,pfreq)){
               return true;
            }
        }
       return false;
        
    }
}