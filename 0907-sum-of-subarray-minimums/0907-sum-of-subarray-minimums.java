class Solution {
    private int[] findpse(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return ans;
    }
    private int[] findnse(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
        long mod=(long)1000000007;
        long sum=0;
        int[] pse=findpse(arr);
        int[] nse=findnse(arr);
        for(int i=0;i<arr.length;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sum=(sum+(arr[i]*left%mod*right%mod))%mod;
        }
        return (int)sum;
        
    }
}