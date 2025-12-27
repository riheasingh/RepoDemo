class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] g={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s="";
            for(int j=0;j<words[i].length();j++){
                char ch=words[i].charAt(j);
                s+=g[ch-'a'];
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int n=0;
        for(String key:map.keySet()){
            n++;
        }

      return n;
    }
}