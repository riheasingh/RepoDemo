// class Solution {
//     public String minRemoveToMakeValid(String s) {
//         Stack<Character> st=new Stack<>();
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='('){
//                st.push(ch);
//                count++;

//             }
//             else if(ch==')'){
//                 if(count>0){
//                     st.push(ch);
//                     count--;
//                 }
                
                
//             }
//             else st.push(ch);
//         }
//         StringBuilder sb=new StringBuilder();
//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
//       sb=sb.reverse();
//       for(int i=sb.length()-1;i>=0;i--){
//         char ch=sb.charAt(i);
//         if(count>0 && ch=='(') {
//             sb.delete(i,i+1);
//             count--;
            
//             }
//       }

//     return sb.toString();
//     }
// }
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        // Pass 1: remove extra ')'
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
                sb.append(ch);
            } 
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                    sb.append(ch);
                }
            } 
            else {
                sb.append(ch);
            }
        }

        // Pass 2: remove extra '('
        StringBuilder result = new StringBuilder();
        int remove = open;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);

            if (ch == '(' && remove > 0) {
                remove--;
                continue;
            }
            result.append(ch);
        }

        return result.reverse().toString();
    }
}