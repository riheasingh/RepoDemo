class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          if(Character.isUpperCase(ch)) str+=(char)(((int)ch)+32);
          else str+=ch;
        }
        return str;
      //  return s.toLowerCase();
        
    }
}