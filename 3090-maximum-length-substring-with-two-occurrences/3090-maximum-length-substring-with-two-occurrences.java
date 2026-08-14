class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                int freq=map.get(s.charAt(i));
                if(freq==1)map.remove(s.charAt(i));
                else map.put(s.charAt(i),freq-1);
                i++;
            }
           max=Math.max(max,j-i+1);
           j++;
        }
    return max;
    }
}