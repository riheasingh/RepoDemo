class Solution {
    public void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1)i++;
            else if(nums[i]!=nums[nums[i]-1]){
                swap(i,nums[i]-1,nums);
            }
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)list.add(nums[j]);
        }
        return list;
    }
}