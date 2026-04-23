class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        backtrack(0,arr,target,current,result);
        return result;
    }
    public void backtrack(int i,int[] arr,int target,List<Integer> current,List<List<Integer>>result){
        if(target==0){
            
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0 || i==arr.length){
            return;
        }
        //Take
        current.add(arr[i]);
        backtrack(i+1,arr,target-arr[i],current,result);

        //remove last one
        current.remove(current.size()-1);
        
        // SKIP DUPLICATES
        while (i + 1 < arr.length &&
               arr[i] == arr[i + 1]) {
            i++;
        }

        //skip
        backtrack(i+1,arr,target,current,result);

    }
}