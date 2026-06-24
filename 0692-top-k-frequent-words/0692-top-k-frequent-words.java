class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            int freq1 = map.get(a);
            int freq2 = map.get(b);
            if(freq1 == freq2){
                return a.compareTo(b);
             }
            return freq2 - freq1;
        });
        for(String key:map.keySet()){
            pq.add(key);
        } 
        List<String> list=new ArrayList<>();
        for(int i=0;i<k;i++){
           
            list.add(pq.remove());
        }
        return list;

    }
}