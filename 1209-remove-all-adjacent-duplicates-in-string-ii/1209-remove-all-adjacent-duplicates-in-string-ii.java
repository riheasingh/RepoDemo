// class Solution {
//     public String removeDuplicates(String s, int k) {
        
//         StringBuilder ans = new StringBuilder();
//         Stack<Character> st = new Stack<>();
//         Stack<Integer> count = new Stack<>();
        
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
            
//             if (!st.isEmpty() && st.peek() == ch) {
//                 st.push(ch);
//                 count.push(count.peek() + 1);
//             } else {
//                 st.push(ch);
//                 count.push(1);
//             }
            
//             if (count.peek() == k) {
//                 for (int j = 0; j < k; j++) {
//                     st.pop();
//                     count.pop();
//                 }
//             }
//         }
        
//         while (!st.isEmpty()) {
//             ans.append(st.pop());
//         }
        
//         return ans.reverse().toString();
//     }
// }

class Solution {
    public String removeDuplicates(String s, int k) {
        
        StringBuilder sb = new StringBuilder();
        int[] count = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            
            int last = sb.length() - 1;
            
            if (last > 0 && sb.charAt(last) == sb.charAt(last - 1)) {
                count[last] = count[last - 1] + 1;
            } else {
                count[last] = 1;
            }
            
            if (count[last] == k) {
                sb.delete(sb.length() - k, sb.length());
            }
        }
        
        return sb.toString();
    }
}