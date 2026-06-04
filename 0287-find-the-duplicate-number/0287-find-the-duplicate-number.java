class Solution {
    //Brute force
    //  public int findDuplicate(int[] nums) {
    //     int a=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]) {
    //                 a= nums[i];
    //                 break;
    //             }
    //         }
    //     }
    //         return a;
    //     }

    // but it takes  s.c=o(logn ) and modify the array which is not asked in question
    public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //    for(int i=0;i<nums.length;i++){
    //      if(nums[i]==nums[i+1]) return nums[i];
           
    //   }
    //   return -1;

    //M2-T.C-0(N) AND S-C-0(N) hashset
    //  HashSet<Integer> set=new HashSet<>();
    //  for(int i=0;i<nums.length;i++){
    //     if(set.contains(nums[i]))return nums[i];
    //     set.add(nums[i]);
    //  }
    //  return -1;

    int slow=0;
    int fast=0;
      while (true) {
            slow = nums[slow];

            if (nums[fast] < 0 || nums[fast] >= nums.length) return -1;
            fast = nums[nums[fast]];

            if (slow == fast) break;
        }
    
    int n1=0;
    int n2=slow;
    while(n1!=n2){
        n1=nums[n1];
        n2=nums[n2];
    }
    return n1;
    }
}