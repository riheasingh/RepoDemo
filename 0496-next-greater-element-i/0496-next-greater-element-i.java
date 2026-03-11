class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     int n=nums2.length;
    //     int[] nge=new int[n];
    //    Stack<Integer> st=new Stack<>();
    //     nge[n-1]=-1;
    //     st.push(nums2[n-1]);
    //     for(int i=n-2;i>=0;i--){
    //         while(!st.isEmpty() && st.peek()<=nums2[i]){
    //             st.pop();
    //         }
    //         nge[i]=st.isEmpty()?-1:st.peek();
    //         st.push(nums2[i]);
    //     }
    //     int[] ans=new int[nums1.length];
    //     int k=0;
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<n;j++){
    //             if(nums1[i]==nums2[j]){
    //             ans[k++]=nge[j];
    //             break;
    //             }
    //         }
    //     }
    //     return ans;

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }

            int nge = st.isEmpty() ? -1 : st.peek();
            map.put(nums2[i], nge);

            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }

      return ans;
        
    }
}