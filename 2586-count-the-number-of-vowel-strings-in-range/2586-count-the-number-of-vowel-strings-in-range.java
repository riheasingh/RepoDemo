class Solution {
    public boolean isVowel(Character ch){
        if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u')return true;
        return false;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String str=words[i];
            if(isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1))) count++;
        }
        return count;
        
    }
}