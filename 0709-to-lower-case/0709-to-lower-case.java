class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
           str+=Character.toLowerCase(s.charAt(i));
        }
        return str;
        
    }
}