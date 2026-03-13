class Solution {
    public int[] dailyTemperatures(int[] arr) {
        // int[] ans=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>arr[i]){
        //             ans[i]=j-i;
        //             break;
        //         }
                

        //     }
        // }
        // return ans;
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])st.pop();
            ans[i]=st.isEmpty()? 0:st.peek()-i;
            st.push(i);
        }
        return ans;
    }
}