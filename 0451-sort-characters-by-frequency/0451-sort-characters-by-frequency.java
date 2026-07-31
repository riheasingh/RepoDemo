class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return b[1]-a[1];
        });
        for(char key:map.keySet()){
            pq.add(new int[]{(int)key,map.get(key)});
        }
        StringBuilder sb=new StringBuilder();
        while(pq.size()>0){
            int[] arr=pq.remove();
            int freq=arr[1];
            char c=(char)arr[0];
            for(int i=1;i<=freq;i++){
                sb.append(c);
            }
        }
       return sb.toString();
   }
}