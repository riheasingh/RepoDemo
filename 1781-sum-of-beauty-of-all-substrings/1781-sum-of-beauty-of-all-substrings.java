 class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
        HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);
                
                int min=Integer.MAX_VALUE;;
                int max=Integer.MIN_VALUE;
                for(char key:map.keySet()){
                    int freq=map.get(key);
                    min=Math.min(freq,min);
                    max=Math.max(freq,max);
                
                }
                int beauty=max-min;
                sum+=beauty;
        }
        }
        return  sum;
     }
 }



