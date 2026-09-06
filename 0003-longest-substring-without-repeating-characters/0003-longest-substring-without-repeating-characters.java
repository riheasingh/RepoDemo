class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set=new HashSet<>();
      
        // int i=0;
        // int j=0;
        // int max=0;
        // while(j<s.length()){
        //     char ch=s.charAt(j);
        //     while(set.contains(ch)){
        //         set.remove(s.charAt(i));
        //         i++;
        //     }
        //     set.add(ch);
        //    max=Math.max(max,j-i+1);
        //     j++;
        // }
       
        // return max;

        //BRUTE FORCE 
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            int c=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(set.contains(ch)) break;
                set.add(ch);
                c++;
               // max=Math.max(max,j-i+1);
            }
            max=Math.max(max,c);
        }
        return max;


        //HASHMAP
        // HashMap<Character,Integer> map = new HashMap<>();

        // int i = 0;
        // int j = 0;
        // int max = 0;

        // while(j < s.length()) {

        //     char ch = s.charAt(j);

        //     map.put(ch, map.getOrDefault(ch, 0) + 1);

        //     while(map.get(ch) > 1) {
        //         char dh=s.charAt(i);
        //         int freq=map.get(dh);
        //         if(freq==1)map.remove(dh);
        //         else map.put(dh, map.get(dh) - 1);

        //         i++;
        //     }

        //     max = Math.max(max, j - i + 1);

        //     j++;
        // }

        // return max;
    }
}