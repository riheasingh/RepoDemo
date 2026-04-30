class Solution {
    // public boolean isPrime(int n){
    //         if(n<=1)return false;
    //         for(int i=2;i*i<=n;i++){
    //             if(n%i==0)return false;
    //         }
    //         return true;
    // }
    public int countPrimes(int n) {
        // int count=0;
        //   for(int i=0;i<n;i++){
        //     if(isPrime(i))count++;

        //   }
        //   return count;
        int count=0;
        if(n<=1)return 0;
        boolean[] isPrime=new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                
                for(int j=2;j*i<n;j++){
                    isPrime[i*j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]==true)count++;
        }
        return count;
    }
}