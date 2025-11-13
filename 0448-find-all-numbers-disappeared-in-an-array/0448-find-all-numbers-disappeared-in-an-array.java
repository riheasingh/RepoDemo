class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = arr.length;
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if (map.containsKey(arr[i])) {
        //         map.put(arr[0], map.get(arr[i]) + 1);
        //     } else
        //         map.put(arr[i], 1);
        // }
        // for (int i = 1; i <= n; i++) {
        //     if (map.containsKey(i))
        //         continue;
        //     else
        //         list.add(i);
        // }
        // return list;


        int n = arr.length;
         List<Integer> list = new ArrayList<>();
        boolean[] present=new boolean[n+1];
        for(int i=0;i<n;i++){
            if(arr[i]>=1 && arr[i]<=n){
                present[arr[i]]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!present[i])list.add(i);
        }
        return list;
   }
}