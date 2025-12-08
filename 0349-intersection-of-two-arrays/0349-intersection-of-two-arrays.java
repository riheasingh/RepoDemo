class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int key:set1){
            if(set2.contains(key) )list.add(key);
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
           ans[i]=list.get(i);
        }
        return ans;
    }
}