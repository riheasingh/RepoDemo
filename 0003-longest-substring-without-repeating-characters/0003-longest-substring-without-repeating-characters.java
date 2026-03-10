class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            
            max=Math.max(max,j-i+1);
            j++;
        }
       
        return max;

        //BRUTE FORCE 
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         char ch=s.charAt(j);
        //         if(set.contains(ch)) break;
        //         set.add(ch);
        //         max=Math.max(max,j-i+1);
        //     }
        // }
        // return max;
    }
}