class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            char ch=s.charAt(i);
            char dh=t.charAt(j);
            if(ch==dh){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return t.length()-j;
        
    }
}