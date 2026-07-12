class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=1;
        for(int i=0;i<arr1.length;i++){
           if(!map.containsKey(arr1[i])) map.put(arr1[i],k++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}