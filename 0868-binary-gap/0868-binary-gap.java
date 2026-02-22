class Solution {
    public int binaryGap(int n) {
        // String s=Integer.toBinaryString(n);
        // int max=0;
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='1'){
        //         for(int j=i+1;j<s.length();j++){
        //             char chs=s.charAt(j);
        //              if(chs=='1'){
        //                 max=Math.max(max,j-i);
        //                 break;
        //              }
        //         }
        //     }
        // }
        // return max;
        //Bit Manupulation lic int binaryGap(int n) {
        int prev = -1;
        int pos = 0;
        int max = 0;

        while (n > 0) {
            if ((n & 1) == 1) {  // found a 1
                if (prev != -1) {
                    max = Math.max(max, pos - prev);
                }
                prev = pos;
            }
            pos++;
            n = n >> 1;
        }
        return max;
        
    }
}