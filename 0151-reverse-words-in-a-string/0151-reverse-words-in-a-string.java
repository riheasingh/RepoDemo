class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        // StringBuilder sb=new StringBuilder();
        // for(int i=str.length-1;i>=0;i--){
        //     sb.append(str[i]);
        //     if(i!=0)sb.append(" ");
        // }
        // return sb.toString();

       String result=String.join(" ",str);
       return result;
    }
}