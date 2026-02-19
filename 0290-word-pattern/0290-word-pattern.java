class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        // length must match
        if(pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

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
