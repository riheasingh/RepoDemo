class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
               st.push(ch);
               count++;

            }
            else if(ch==')'){
                if(count>0){
                    st.push(ch);
                    count--;
                }
                
                
            }
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
      sb=sb.reverse();
      for(int i=sb.length()-1;i>=0;i--){
        char ch=sb.charAt(i);
        if(count>0 && ch=='(') {
            sb.delete(i,i+1);
            count--;
            
            }
      }

    return sb.toString();
    }
}