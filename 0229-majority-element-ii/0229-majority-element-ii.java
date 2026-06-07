class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0,count2=0,ele1=0,ele2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i])count1++;
            else if(ele2==nums[i]) count2++;
            else if(count1==0){
                ele1=nums[i];
                count1++;
            }
            else if(count2==0){
                ele2=nums[i];
                count2++;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        int count11=0;
        int count22=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1)count11++;
            else if(nums[i]==ele2)count22++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        if(count11>n/3) list.add(ele1);
        if(count22>n/3)list.add(ele2);
        return list;
    }
}