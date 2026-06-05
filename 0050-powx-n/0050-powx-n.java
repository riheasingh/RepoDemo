class Solution {
    public double pow(double x,int n){
        if(n==0)return 1;
        double ans=pow(x,n/2);
        if(n%2==0) return ans*ans;
        return ans*ans*x;
    }
   public double myPow(double x, int n) {
       if(n<0){
        n=-n;
        x=1/x;
       }
       return pow(x,n);
        
    }
}