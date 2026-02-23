class Solution {
    public boolean hasAllCodes(String s, int k) {
        // int total=(int)Math.pow(2,k);
        // for(int i=0;i<total;i++){
        //     String str=Integer.toBinaryString(i);
        //     int count=k-str.length();
        //     String ans="";
        //     while(count>0){
        //        ans+="0";
        //        count--;
        //     }
        //     ans+=str;
        //     if(!s.contains(ans)) return false;

        // }
        // return true;

      if(s.length() < k) return false;

        HashSet<String> set = new HashSet<>();

        // sliding window
        for(int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
        }

        return set.size() == (int)Math.pow(2, k);
    }
}
        
    