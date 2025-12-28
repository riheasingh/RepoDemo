class Solution {
    public String reverse(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
        char temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
      return String.valueOf(arr);
    }
    public String reverseWords(String s) {
        String[] str=s.split("\\s+");
        for(int i=0;i<str.length;i++){
            str[i]=reverse(str[i]);
        }
        return String.join(" ",str);
    }
}