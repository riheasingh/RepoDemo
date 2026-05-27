class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))map1.put(ch,i);
            else {
                if(map2.containsKey(ch)) continue;
                else map2.put(ch,i);
            }
        }
        int count=0;
        for(char key:map1.keySet()){
            char ch=Character.toUpperCase(key);
            int freq1=map1.get(key);
            if(map2.containsKey(ch)){
                int freq2=map2.get(ch);
                if(freq1<freq2)count++;
            }
        }
        return count;
    }
}