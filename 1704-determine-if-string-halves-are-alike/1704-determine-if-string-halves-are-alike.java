class Solution {
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int countVow1=0,countVow2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<s.length()/2){
                if(isVowel(ch))countVow1++;
            }
            else{
                 if(isVowel(ch))countVow2++;
            }
        }
        return countVow1==countVow2;
    }
}