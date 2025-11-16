class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];
        for(char c:s.toCharArray()){
            freq[c]+=1;
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>( (a,b)->freq[b]-freq[a]);
        for(int i=0;i<128;i++){
            if(freq[i]>0) maxHeap.add((char)i);
        }
        StringBuilder sb=new StringBuilder();
        while(!maxHeap.isEmpty()){
            char ch=maxHeap.poll();
            int count=freq[ch];
            while(count!=0){
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();

   }
}