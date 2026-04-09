class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int num = 0;
        int sign = 1;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(i == 0 && ch == '+'){
                sign = 1;
            }
            else if(i == 0 && ch == '-'){
                sign = -1;
            }
            else if(Character.isDigit(ch)){

                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    int digit = s.charAt(i) - '0';

                    // ✅ overflow check
                    if(num > (Integer.MAX_VALUE - digit) / 10){
                        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }

                    num = num * 10 + digit;
                    i++;
                }
                break;
            }
            else break;
        }

        return num * sign;
    }
}