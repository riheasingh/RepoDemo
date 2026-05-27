class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch))set1.add(ch);
            else set2.add(ch);
        }
        int count=0;
        for(char key:set1){
            char ch=Character.toUpperCase(key);
            if(set2.contains(ch))count++;
        }
        return count;
    }
}