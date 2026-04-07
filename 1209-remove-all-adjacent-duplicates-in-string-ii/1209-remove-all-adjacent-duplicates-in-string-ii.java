import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {
        
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!st.isEmpty() && st.peek() == ch) {
                st.push(ch);
                count.push(count.peek() + 1);
            } else {
                st.push(ch);
                count.push(1);
            }
            
            if (count.peek() == k) {
                for (int j = 0; j < k; j++) {
                    st.pop();
                    count.pop();
                }
            }
        }
        
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        
        return ans.reverse().toString();
    }
}