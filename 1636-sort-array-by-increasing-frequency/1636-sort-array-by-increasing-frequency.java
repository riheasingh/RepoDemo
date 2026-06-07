class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return b[0]-a[0];
            }
            return a[1]-b[1];
        });
        for(int key:map.keySet()){
            int freq=map.get(key);
            pq.add(new int[]{key,freq});
        }
        int[] ans=new int[nums.length];
        int k=0;
        while(pq.size()>0){
            int[] arr=pq.remove();
            int ele=arr[0];
            int freq=arr[1];
            for(int i=0;i<freq;i++){
                ans[k++]=ele;
            }
        }
        return ans;

    }
}