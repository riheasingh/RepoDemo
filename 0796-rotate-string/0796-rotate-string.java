class Solution {
    public void reverse(char[] arr,int i, int j){
         while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
         }
    }
    public boolean isEqual(char[] arr,char[] target){
       for(int i=0;i<arr.length;i++){
         if(arr[i]!=target[i]) return false;
       }
       return true;
    }
    public boolean rotateString(String s, String goal) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        char[] target=goal.toCharArray();
        int m=target.length;
        if(m!=n) return false;
        if (isEqual(arr, target)) return true;
        for(int i=1;i<arr.length;i++){
            reverse(arr,0,i-1);
            reverse(arr,i,n-1);
            reverse(arr,0,n-1);
            boolean isEqual=isEqual(arr,target);
            if(isEqual) return true;
              arr = s.toCharArray();
        }
        return false;
    }
}
