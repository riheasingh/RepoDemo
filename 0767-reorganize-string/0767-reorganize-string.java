class Solution {
    public String reorganizeString(String s) {
        HashMap<Character ,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[1]-a[1]));
        for(char key:map.keySet()){
            int freq=map.get(key);
            pq.add(new int[]{key,freq});
        }
        StringBuilder sb=new StringBuilder();
        while(pq.size()>1){
            int[] first=pq.remove();
            int[] second=pq.remove();
            sb.append((char)first[0]);
            sb.append((char)second[0]);
            first[1]--;
            second[1]--;
            if(first[1]>0)pq.add(first);
            if(second[1]>0)pq.add(second);
        }
        if(!pq.isEmpty()){
            int[] last=pq.remove();
            if(last[1]>1) return "";
            sb.append((char)last[0]);
        }
        return sb.toString();
    }
}