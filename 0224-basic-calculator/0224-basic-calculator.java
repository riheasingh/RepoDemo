class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;

                result += sign * num;
            }
            else if(ch == '+'){
                sign = 1;
            }
            else if(ch == '-'){
                sign = -1;
            }
            else if(ch == '('){
                // save current state
                stack.push(result);
                stack.push(sign);

                // reset for new expression
                result = 0;
                sign = 1;
            }
            else if(ch == ')'){
                // first apply sign before bracket
                result *= stack.pop();

                // then add previous result
                result += stack.pop();
            }
        }

        return result;
    }
}