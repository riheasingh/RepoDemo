class Solution {
    public boolean checkInclusion(String p, String s) {
    //     if(s.length()<p.length()) return false;
    //     int[] pfreq=new int[26];
    //     int[] winfreq=new int[26];
    //     for(char c:p.toCharArray()){
    //         pfreq[c-'a']++;
    //     }
    //     int k=p.length();
    //     for(int i=0;i<s.length();i++){
    //         winfreq[s.charAt(i)-'a']++;
    //         if(i>=k){
    //             winfreq[s.charAt(i-k)-'a']--;
    //         }
    //         if(Arrays.equals(winfreq,pfreq)){
    //            return true;
    //         }
    //     }
    //    return false;
    if(p.length()>s.length())return false;
    HashMap<Character,Integer> map1=new HashMap<>();
    for(char c:p.toCharArray()){
        map1.put(c,map1.getOrDefault(c,0)+1);
    }
    HashMap<Character,Integer> map2=new HashMap<>();
     int k=p.length();
     for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
     }
     if(map1.equals(map2))return true;
     int i=0;
    
     int j=k;
    
     while(j<s.length()){
        char ch=s.charAt(i);
        char dh=s.charAt(j);
        if(map2.get(ch)==1)map2.remove(ch);
       else map2.put(ch,map2.get(ch)-1);
       if(map2.containsKey(dh))map2.put(dh,map2.get(dh)+1);
       else map2.put(dh,1);
       if(map1.equals(map2))return true;
       j++;
       i++;
     }
     return false;
        
    }
}