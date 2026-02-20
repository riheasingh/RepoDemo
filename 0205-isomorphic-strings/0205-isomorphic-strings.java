class Solution {
    public boolean isIsomorphic(String pattern, String words) {
        // char[] a=new char[128];
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     char dh=t.charAt(i);
        //     int idx=(int)ch;
        //     if(a[idx]=='\0')a[idx]=dh;
        //     else{
        //         if(a[idx]!=dh)return false;
        //     }
        // }
        // char[] b=new char[128];
        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     char dh=s.charAt(i);
        //     int idx=(int)ch;
        //     if(b[idx]=='\0')b[idx]=dh;
        //     else{
        //         if(b[idx]!=dh)return false;
        //     }
        // }
        // return true;
        
        // Method 2-HashMap
        // length must match
        if(pattern.length() != words.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            char word = words.charAt(i);

            // Case 1: char already mapped
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(word))
                    return false;
            }

            // Case 2: word already mapped
            else if(reverse.containsKey(word)) {
                return false;
            }

            // Case 3: new mapping
            else {
                map.put(ch, word);
                reverse.put(word, ch);
            }
        }

        return true;
    }
}