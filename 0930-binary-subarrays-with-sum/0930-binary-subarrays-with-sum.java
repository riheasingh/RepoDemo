class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal)count++;
        //         if(sum>goal)break;

        //     }

        // }
        // return count;

        
    }
    private int atMost(int[] nums, int goal){
        if(goal < 0) return 0;

        int i = 0, sum = 0, count = 0;

        for(int j = 0; j < nums.length; j++){
            sum += nums[j];

            while(sum > goal){
                sum -= nums[i];
                i++;
            }

            count += j - i + 1;   // key line
        }
        return count;
    }
        
    }

