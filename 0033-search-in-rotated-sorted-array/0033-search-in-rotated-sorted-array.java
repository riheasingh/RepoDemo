class Solution {
    public int search(int[] nums, int target) {
        // int i=0;
        // int j=nums.length-1;
        // while(i<=j){
        //     if(nums[i]!=target && nums[j]!=target){
        //         i++;
        //         j--;
        //     }
        //     else if(nums[i]==target)return i;
        //     else return j;
        // }
        // return -1;

        //Binary search

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                // Target lies inside left half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                }
                // Otherwise search right half
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies inside right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }
                // Otherwise search left half
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
        
    }
}