class Solution {
    public char[]  reverse(char[] arr,int i,int j){
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        
        }
        return arr;
    }
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i+=2*k){
            int min=Math.min(i+k-1,arr.length-1);
            arr=reverse(arr,i,min);
        }
        return new String(arr);
    }
}