class Solution {
    public int maxProduct(int n) {
       String s= String.valueOf(n);
       char[] arr=s.toCharArray();
       Arrays.sort(arr);
       int len=arr.length;
       return (arr[len-1]-'0')*(arr[len-2]-'0');

    }
}