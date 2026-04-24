class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='R')right++;
            else if(ch=='L')left++;
        }
        int dist=0;
        if(left>=right){
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='_'|| ch=='L')dist++;
                else dist-=1;
            }
        }
        else{
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='_'|| ch=='R')dist++;
                else dist-=1;
            }
        }
        return dist;
    }
}