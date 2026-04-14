// class Solution {
//     public int myAtoi(String s) {
//         s = s.trim();
//         int num = 0;
//         int sign = 1;

//         for(int i = 0; i < s.length(); i++){
//             char ch = s.charAt(i);

//             if(i == 0 && ch == '+'){
//                 sign = 1;
//             }
//             else if(i == 0 && ch == '-'){
//                 sign = -1;
//             }
//             else if(Character.isDigit(ch)){

//                 while(i < s.length() && Character.isDigit(s.charAt(i))){
//                     int digit = s.charAt(i) - '0';

//                     // ✅ overflow check
//                     if(num > (Integer.MAX_VALUE - digit) / 10){
//                         return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//                     }

//                     num = num * 10 + digit;
//                     i++;
//                 }
//                 break;
//             }
//             else break;
//         }

//         return num * sign;
//     }
// }

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        return helper(s, 0, 0, 1);
    }

    private int helper(String s, int i, int num, int sign) {
        if (i >= s.length()) return num * sign;

        char ch = s.charAt(i);

        // your same logic
        if (i == 0 && ch == '+') {
            return helper(s, i + 1, num, 1);
        }
        else if (i == 0 && ch == '-') {
            return helper(s, i + 1, num, -1);
        }
        else if (Character.isDigit(ch)) {

            int digit = ch - '0';

            // overflow check
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            return helper(s, i + 1, num * 10 + digit, sign);
        }

        return num * sign;
    }
}