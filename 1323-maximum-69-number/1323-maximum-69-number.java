class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        int count=0;
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6' && count==0) {
                str+='9';
                count++;
            }
            else str+=ch;
        }
        return Integer.parseInt(str);
        
    }
}