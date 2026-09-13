// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> ans = new ArrayList<>();
//         int n = nums.length;
//         for(int i = 0; i < n; i++) {
//             for(int j = i + 1; j < n; j++) {
//                 for(int k = j + 1; k < n; k++) {
//                     for(int l = k + 1; l < n; l++) {
//                         long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
//                         if(sum == target) {
//                             List<Integer> list = new ArrayList<>();
//                             list.add(nums[i]);
//                             list.add(nums[j]);
//                             list.add(nums[k]);
//                             list.add(nums[l]);
//                             Collections.sort(list);
//                             if(!ans.contains(list)) {
//                                 ans.add(list);
//                             }
//                         }
//                     }
//                 }
//             }
//         }

//         return ans;
//     }
// }

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>>ans=new ArrayList<>();
      int n=nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1])continue;
        for(int j=i+1;j<n;j++){
            if(j>i+1 && nums[j]==nums[j-1])continue;
            int p=j+1;
            int k=n-1;
            while(p<k){
                long sum=(long)nums[i]+nums[j]+nums[p]+nums[k];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[p],nums[k]));
                    p++;
                    k--;
                    while(p<k && nums[p]==nums[p-1])p++;
                    while(p<k && nums[k]==nums[k+1])k--;

                }
                else if(sum<target) p++;
                else k--;
            }
        }
      }
      return ans;
      
    }
}
