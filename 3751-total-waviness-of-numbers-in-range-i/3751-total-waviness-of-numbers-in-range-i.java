class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int j=num1;j<=num2;j++){
            String s=String.valueOf(j);
            for(int i=1;i<s.length()-1;i++){
               
               if(s.charAt(i)-'0'>s.charAt(i-1)-'0' && s.charAt(i)-'0'>s.charAt(i+1)-'0')count++;
               else if(s.charAt(i)-'0'<s.charAt(i-1)-'0' && s.charAt(i)-'0'<s.charAt(i+1)-'0')count++;
            }
        }
        return count;
    }
}