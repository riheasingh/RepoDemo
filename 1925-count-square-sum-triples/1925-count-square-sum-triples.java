class Solution {

    // public int countTriples(int n) {
    //     HashMap<Long,Long> map=new HashMap<>();
    //     for(long i=1;i<=n;i++){
    //         map.put(i,1L);
    //     }
    //     int count=0;
    //     for(long i=1;i<=n-1;i++){
    //         for(long j=1;j<=n;j++){
    //             long a=i*i;
    //             long b=j*j;
    //             long c=(long)Math.sqrt(a+b);
    //             if((c*c==a+b) && map.containsKey(c)) count++;
    //         }
    //     }
    //     return count;
        
    // }
    public int countTriples(int n) {
        
        int count=0;
        for(int i=1;i<=n-1;i++){
            for(int  j=1;j<=n;j++){
               int a=i*i;
              int b=j*j;
               int c=(int)Math.sqrt(a+b);
                if((c*c==a+b) && c<=n) count++;
            }
        }
        return count;
        
    }
}