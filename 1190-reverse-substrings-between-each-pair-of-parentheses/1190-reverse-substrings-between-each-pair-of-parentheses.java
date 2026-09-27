class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch != ')') {
                st.push(ch);
            } 
            else {
                // Reverse characters until '('
                StringBuilder temp = new StringBuilder();

                while (st.peek() != '(') {
                    temp.append(st.pop());
                }

                // Remove '('
                st.pop();

                // Put reversed substring back
                for (char c : temp.toString().toCharArray()) {
                    st.push(c);
                }
            }
        }

        // Build final answer
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
