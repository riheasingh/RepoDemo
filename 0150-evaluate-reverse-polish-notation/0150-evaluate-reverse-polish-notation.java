class Solution {
    public int evalRPN(String[] str) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<str.length;i++){
           if(str[i].equals("+")||str[i].equals("-")||str[i].equals("*")||str[i].equals("/")){
                int val2=st.pop();
                int val1=st.pop();
                if(str[i].equals("+"))st.push(val1+val2);
                if(str[i].equals("-"))st.push(val1-val2);
                if(str[i].equals("*"))st.push(val1*val2);
                if(str[i].equals("/"))st.push(val1/val2);
                
            }
            else st.push(Integer.parseInt(str[i]));
        }
        return st.pop();
        
    }
}