class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
           Arrays.sort(arr);
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        backtrack(0,arr,target,current,result,set);
        return result;
    }
    public void backtrack(int i,int[] arr,int target,List<Integer> current,List<List<Integer>>result, HashSet<List<Integer>> set){
        if(target==0){
           
            if(!set.contains(current)){
                result.add(new ArrayList<>(current));
                set.add(new ArrayList<>(current));
            }
            return;
        }
        if(target<0 || i==arr.length){
            return;
        }
        //Take
        current.add(arr[i]);
        backtrack(i+1,arr,target-arr[i],current,result,set);

        //remove last one
        current.remove(current.size()-1);

        

        //skip
        backtrack(i+1,arr,target,current,result,set);

    }
}