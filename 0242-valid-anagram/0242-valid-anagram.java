class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()) return false;
        // char[] ch=s.toCharArray();
        // char[] cha=t.toCharArray();
        // Arrays.sort(ch);
        // Arrays.sort(cha);
        // for(int i=0;i<ch.length;i++){
        //     if(ch[i]!=cha[i]) return false;
        // }
        // return true;


        //METHOD 2
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> smap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(smap.containsKey(key)) {
                int freq=smap.get(key);
                smap.put(key,freq+1);
            }
            else{
                smap.put(key,1);
            }
        }
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            if(tmap.containsKey(key)) {
                int freq=tmap.get(key);
                tmap.put(key,freq+1);
            }
            else{
                tmap.put(key,1);
            }
        }
        for(char key:smap.keySet()){
            int val1=smap.get(key);
            if(tmap.containsKey(key)==false) return false;
            int val2=tmap.get(key);
            if(val1!=val2) return false;
        }
        return true;
    }
}