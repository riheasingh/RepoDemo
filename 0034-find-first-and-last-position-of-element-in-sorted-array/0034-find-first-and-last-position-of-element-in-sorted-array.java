class Solution {
    public int firstPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                ans = mid;
                high = mid - 1; // move left
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public int lastPosition(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                ans = mid;
                low = mid + 1; // move right
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
    //     int first = -1;
    //     int last = -1;
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] == target){
    //             if(first == -1){
    //                 first = i;
    //             }
    //             last = i;
    //         }
    //     }
    // return new int[]{first, last};

    int first = firstPosition(nums, target);
    int last = lastPosition(nums, target);

        return new int[]{first, last};
    }
}