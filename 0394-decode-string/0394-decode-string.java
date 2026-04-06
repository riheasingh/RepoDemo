class Solution {
    public String decodeString(String s) {
        StringBuilder s1=new StringBuilder();
        int count=0;
        Stack<StringBuilder> str=new Stack<>();
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                count=count*10+(c-'0');
            }
            else if(c=='['){
               str.push(s1);
               val.push(count);
               s1=new StringBuilder();
               count=0;
            }
            else if(c==']'){
                StringBuilder s2=str.pop();
                int n=val.pop();
                for(int j=0;j<n;j++){
                    s2.append(s1);
                }
                s1=s2;
            }
            else{
                s1=s1.append(c);
            }
        }
        return s1.toString();

    }
}