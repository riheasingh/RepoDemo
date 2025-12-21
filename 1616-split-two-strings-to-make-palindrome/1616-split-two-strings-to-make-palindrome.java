class Solution {
    public boolean palindrome(String a,int  i,int j){
        
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }
       return true;
    }
    public boolean check(String a,String b){
        int i=0;
        int j=a.length()-1;
        while(i<j && a.charAt(i)==b.charAt(j)){
             i++;
             j--;
        }
        //  String aprefix=a.substring(0,i);
        //  String bsuffix=b.substring(i);
        // return palindrome(aprefix+bsuffix);
        return palindrome(a,i,j)||palindrome(b,i,j);
    }
    public boolean checkPalindromeFormation(String a, String b) {
        // for(int i=0;i<a.length();i++){
        //     String aprefix=a.substring(0,i);
        //     String asuffix=a.substring(i);
        //     String bprefix=b.substring(0,i);
        //     String bsuffix=b.substring(i);
        //   boolean isPalindrome=palindrome(aprefix+bsuffix)||palindrome(bprefix+asuffix);
        //   if(isPalindrome==true) return true;

        // }
        
        return check(a,b)||check(b,a);
    }
}