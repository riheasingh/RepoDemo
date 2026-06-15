class Solution {
    public String mapWordWeights(String[] words, int[] w) {
        String ans="";
        char[] arr=new char[26];
        for(int i=0;i<26;i++){
            arr[i]=(char)('z'-i);
        }
         for(int i=0;i<words.length;i++){
            String word=words[i];
            int sum=0;
            for(int j=0;j<word.length();j++){
                int idx=word.charAt(j)-'a';
                sum+=w[idx];
            }
            sum=sum%26;
            ans+=arr[sum];

         }
         return ans;
    }
}