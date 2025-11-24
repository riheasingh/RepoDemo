// class Solution {
//     public List<Boolean> prefixesDivBy5(int[] nums) {
//        List<Boolean> ans=new ArrayList<>();
//         int[] temp=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j>=0;j--){
//                 double a=Math.pow(2,(i-j));
//                 temp[i]+=(int)a*nums[j];
                
//             }
//             if(temp[i]%5==0) ans.add(true);
//             else ans.add(false);
//         }
//         return ans;
        
//     }
// }
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        
        int curr = 0;  // stores xi % 5
        
        for (int bit : nums) {
            curr = (curr * 2 + bit) % 5;
            ans.add(curr == 0);
        }
        
        return ans;
    }
}
