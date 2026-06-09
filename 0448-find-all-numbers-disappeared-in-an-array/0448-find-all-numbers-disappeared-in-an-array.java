class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
       for(int i=1;i<=arr.length;i++){
        if(!set.contains(i))list.add(i);
       }
        return list;


        
   }
}