class Solution {
    public int[] nextsmallerleft(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
          while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
          }
          ans[i]=st.isEmpty()?-1:st.peek();
          st.push(i);
        }
        return ans;
    }
     public int[] nextsmallerright(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
          while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
          }
          ans[i]=st.isEmpty()? arr.length:st.peek();
          st.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] arr) {
        int max=Integer.MIN_VALUE;
        int[] nsr=nextsmallerright(arr);
        int[] nsl=nextsmallerleft(arr);
        for(int i=0;i<arr.length;i++){
            int left=i-nsl[i];
            int right=nsr[i]-i;
            int width=left+right-1;
            int height=arr[i];
            int area=width*height;
            max=Math.max(max,area);
        }

        return max;
    }
}