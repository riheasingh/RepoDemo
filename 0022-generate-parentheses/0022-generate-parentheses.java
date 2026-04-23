class Solution {
   public void print(int open ,int close,int n,String s,List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n)print(open+1 , close,n,s+"(",ans);
        if(close<open)print( open , close+1, n,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
      List<String>  ans=new ArrayList<>();
        print(0,0,n,"",ans);
        return ans;
        }
}