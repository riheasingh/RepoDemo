class Solution {
    public  String longestcommonpref(String a,String b){
     StringBuilder sb=new StringBuilder();
       int  i=0;
       int  j=0;
     while(i<a.length() && j<b.length()){
        if(a.charAt(i)==b.charAt(j)){sb.append(a.charAt(i));
        i++;
        j++;
        }
        else break;
    }
     return sb.toString();
       
    }
    public String longestCommonPrefix(String[] strs) {
     String  lcp=strs[0];
        for(int i=1;i<strs.length;i++){
            lcp=longestcommonpref(lcp,strs[i]);
        }
       return lcp;
    }
}