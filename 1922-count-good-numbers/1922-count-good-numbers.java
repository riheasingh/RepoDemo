class Solution {
    static long M=1000000007;
    public long  pow(long x, long n){
        if(n==0) return 1;
        long ans=pow(x,n/2);
        if(n%2==0) return (ans*ans)%M;
        else  return (((ans*ans)%M)*x)%M;
    }
    
   public int countGoodNumbers(long n) {
       return (int)((pow(5,(n+1)/2)*pow(4,(n/2)))%M);
    }
}

