class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int[] f=new int[128];
        for(char c:t.toCharArray()){
            f[c]++;
        }
        int l=0;
        int r=0;
        int start=0;
        int count=t.length();
        int min=Integer.MAX_VALUE;
        while(r<s.length()){
            if(f[s.charAt(r++)]-->0)count--;
            while(count==0){
                if(r-l<min){
                    min=r-l;
                    start=l;
                }
                if(++f[s.charAt(l++)]>0)count++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}
