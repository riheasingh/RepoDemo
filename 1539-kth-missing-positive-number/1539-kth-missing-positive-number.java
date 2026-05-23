class Solution {
    public int findKthPositive(int[] arr, int k) {
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
         }
         int max=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
         }
         int count=0;
         for(int i=1;i<=max;i++){
            if(!set.contains(i))count++;
            if(count==k)return i;
         }

        return arr[arr.length-1]+k-count;
        
    }
}